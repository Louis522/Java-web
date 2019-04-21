package com.svse.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svse.entity.CardetailEntity;
import com.svse.entity.InCarEntity;
import com.svse.service.IncarService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("incar.do")
public class IncarControl {

	@Autowired
	private IncarService cserv;
	

	// ���
	@RequestMapping(params = "method=add")
	@ResponseBody
	public int addIncar(InCarEntity Incar) {
		Incar.setIncarcount(0);
		Incar.setIncarflag(0);
		this.cserv.add(Incar);
		return 1;
	}


	// �޸�
	@RequestMapping(params = "method=upp")
	@ResponseBody
	public int uppIncar(InCarEntity Incar) {
		InCarEntity cc = this.cserv.getOne(Incar.getIncarid());
		cc.setIncarcount(Incar.getIncarcount());
		cc.setIncarflag(1);
		this.cserv.upp(cc);
		return 1;
	}

	// ȫ��ѯ
	@RequestMapping(params = "method=all")
	@ResponseBody
	public JSONObject all(int limit, int offset) {
		// ���ж�����
		int count = this.cserv.count();
		List<InCarEntity> ar = this.cserv.getAll(offset, limit);
		JSONObject obj = new JSONObject();
		obj.put("rows", ar);
		obj.put("total", count);
		return obj;
	}

	@RequestMapping(params = "method=allIncar")
	@ResponseBody
	public List<InCarEntity> getAll() {
		List<InCarEntity> ar = this.cserv.getAll();
		return ar;
	}

	//��ѯ����
	@RequestMapping(params = "method=one")
	@ResponseBody
	public InCarEntity getOneIncar(int Incarid) {
		InCarEntity Incar = this.cserv.getOne(Incarid);
		return Incar;
	}
	
	//��ѯ����
	@RequestMapping(params = "method=alld")
	@ResponseBody
	public List<CardetailEntity> getAllh() {
		List<CardetailEntity> ar=this.cserv.alld();
		return ar;
	}
	
	
}
