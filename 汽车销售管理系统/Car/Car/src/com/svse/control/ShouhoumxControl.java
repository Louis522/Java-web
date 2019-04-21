package com.svse.control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svse.entity.MasterEntity;
import com.svse.entity.ShoumxEntity;
import com.svse.service.ShouhouService;
import com.svse.service.ShoumxService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("shoumx.do")
public class ShouhoumxControl {

	@Autowired
	private ShoumxService smserv;

	// ���
	@RequestMapping(params = "method=add")
	@ResponseBody
	public int add(ShoumxEntity shoumx, HttpSession session) {
		//������
		MasterEntity m = (MasterEntity) session.getAttribute("master");
		shoumx.setMid(m.getMid());
		//�Ƿ��շ�
		this.smserv.add(shoumx);
		return 1;
	}

	// �޸�
	@RequestMapping(params = "method=upp")
	@ResponseBody
	public int upp(ShoumxEntity shoumx, HttpSession session) {
		MasterEntity m = (MasterEntity) session.getAttribute("master");
		shoumx.setMid(m.getMid());
		ShoumxEntity shou=this.smserv.getOne(shoumx.getShouhoumxid());
		shoumx.setShouhouid(shou.getShouhouid());
		this.smserv.upp(shoumx);
		return 1;
	}
	// ȫ��ѯ
	@RequestMapping(params = "method=alls")
	@ResponseBody
	public List<ShoumxEntity> alls() {
		// ���ж�����
		List<ShoumxEntity> ar = this.smserv.getAll();
		return ar;
	}
	// ��ѯ����
	@RequestMapping(params = "method=one")
	@ResponseBody
	public ShoumxEntity one(int shouhoumxid) {
		ShoumxEntity shou=this.smserv.getOne(shouhoumxid);
		return shou;
	}
	// ��ҳ��ѯ
	@RequestMapping(params = "method=all")
	@ResponseBody
	public JSONObject all(int limit, int offset, int shouhouid) {
		// ���ж�����
		int count = this.smserv.count(shouhouid);
		List<ShoumxEntity> ar = this.smserv.getAll(offset, limit, shouhouid);
		JSONObject obj = new JSONObject();
		obj.put("rows", ar);
		obj.put("total", count);
		return obj;
	}
}
