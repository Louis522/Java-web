package com.svse.control;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svse.entity.FujianEntity;
import com.svse.entity.InhandoutEntity;
import com.svse.entity.MasterEntity;
import com.svse.entity.SaleZengpinEntity;
import com.svse.service.FujianService;
import com.svse.service.InhandoutService;
import com.svse.service.SaleZengpinService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("salezp.do")
public class SaleControl {

	@Autowired
	private SaleZengpinService saserv;

	@Autowired
	private InhandoutService hserv;
	
	@Autowired
	private FujianService fserv;

	// ���
	@RequestMapping(params = "method=add")
	@ResponseBody
	public int addSaleZengpin(SaleZengpinEntity salezp, HttpSession session) {
		MasterEntity m = (MasterEntity) session.getAttribute("master");
		Date d = new Date();
		SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = ff.format(d);
		salezp.setSaletime(time);
		salezp.setMid(m.getMid());
		this.saserv.addSaleZengpin(salezp);
		// �޸�����
		InhandoutEntity inhandout = this.hserv.getOne(salezp.getInhandoutid());
		inhandout.setInhandoutcount(inhandout.getInhandoutcount() - salezp.getSalecount());
		this.hserv.upp(inhandout);
		return 1;
	}

	// �޸�
	@RequestMapping(params = "method=upp")
	@ResponseBody
	public int uppSaleZengpin(SaleZengpinEntity salezp) {
		SaleZengpinEntity oldsale = this.saserv.getOne(salezp.getSalezpid());
		salezp.setMid(oldsale.getMid());
		salezp.setSaletime(oldsale.getSaletime());
		// �ж��Ƿ����ǰ��ͬ
		if (oldsale.getInhandoutid() == salezp.getInhandoutid()) {
			// ��ͬ
			// �޸�����
			InhandoutEntity inhandout = this.hserv.getOne(salezp.getInhandoutid());
			inhandout.setInhandoutcount(inhandout.getInhandoutcount() + oldsale.getSalecount() - salezp.getSalecount());
			if (inhandout.getInhandoutcount() > 0) {
				inhandout.setInhandoutflag(1);
			} else {
				inhandout.setInhandoutflag(0);
			}
			this.hserv.upp(inhandout);
		} else {
			// ��ͬ
			// �޸ľ�����
			InhandoutEntity inhandout = this.hserv.getOne(oldsale.getInhandoutid());
			inhandout.setInhandoutcount(inhandout.getInhandoutcount() + oldsale.getSalecount());
			if (inhandout.getInhandoutcount() > 0) {
				inhandout.setInhandoutflag(1);
			} else {
				inhandout.setInhandoutflag(0);
			}
			this.hserv.upp(inhandout);
			// �޸�������
			InhandoutEntity inhandouts = this.hserv.getOne(salezp.getInhandoutid());
			inhandouts.setInhandoutcount(inhandouts.getInhandoutcount() - salezp.getSalecount());
			if (inhandouts.getInhandoutcount() > 0) {
				inhandouts.setInhandoutflag(1);
			} else {
				inhandouts.setInhandoutflag(0);
			}
			this.hserv.upp(inhandouts);
		}
		this.saserv.uppSaleZengpin(salezp);
		return 1;
	}

	// ȫ��ѯ
	@RequestMapping(params = "method=all")
	@ResponseBody
	public JSONObject all(int limit, int offset, int inhandoutid) {
		// ���ж�����
		int count = this.saserv.count(inhandoutid);
		List<SaleZengpinEntity> ar = this.saserv.getAll(offset, limit, inhandoutid);
		JSONObject obj = new JSONObject();
		obj.put("rows", ar);
		obj.put("total", count);
		return obj;
	}

	// ȫ��ѯ
	@RequestMapping(params = "method=saleall")
	@ResponseBody
	public JSONObject saleall(int limit, int offset, int flag) {
		JSONObject obj = new JSONObject();
		if(flag==0){
			//������
			List<SaleZengpinEntity> ar = this.saserv.getAlls(offset, limit);
			// ���ж�����
			int count = this.saserv.counts();
			obj.put("rows", ar);
			obj.put("total", count);
		}else if(flag==1){
			//������
			List<FujianEntity> ar =this.fserv.getAlls(offset, limit); 
			List<SaleZengpinEntity> arr = new ArrayList<SaleZengpinEntity>();
			for (FujianEntity f : ar) {
				SaleZengpinEntity s=new SaleZengpinEntity();
				s.setInhandoutid(f.getInhandoutid());
				s.setKehuname(f.getCustomname());
				s.setKehutel(f.getCustomtel());
				s.setHandoutname(f.getHandoutname());
				s.setSalecount(1);
				s.setSaletime(f.getCarouttime());
				s.setMrealname(f.getMrealname());
				arr.add(s);
			}
			// ���ж�����
			int count = this.fserv.count();
			obj.put("rows", arr);
			obj.put("total", count);
		}
		return obj;
	}

	// ȫ��ѯ
	@RequestMapping(params = "method=alls")
	@ResponseBody
	public JSONObject all(int limit, int offset) {
		// ���ж�����
		int count = this.saserv.counts();
		List<SaleZengpinEntity> ar = this.saserv.getAll(offset, limit);
		JSONObject obj = new JSONObject();
		obj.put("rows", ar);
		obj.put("total", count);
		return obj;
	}

	// ȫ��ѯ
	@RequestMapping(params = "method=allsalezp")
	@ResponseBody
	public List<SaleZengpinEntity> getAll() {
		List<SaleZengpinEntity> ar = this.saserv.getAll();
		return ar;
	}

	// ��ѯ
	@RequestMapping(params = "method=one")
	@ResponseBody
	public List getOne(int salezpid) {
		List ar = new ArrayList();
		List<InhandoutEntity> ars = this.hserv.getAlls();
		SaleZengpinEntity sale = this.saserv.getOne(salezpid);
		ar.add(sale);
		for (InhandoutEntity h : ars) {
			ar.add(h);
		}
		return ar;
	}

}
