package com.svse.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svse.entity.FujianEntity;
import com.svse.entity.InCarEntity;
import com.svse.entity.InCarmxEntity;
import com.svse.entity.InhandoutEntity;
import com.svse.service.FujianService;
import com.svse.service.IncarService;
import com.svse.service.InhandoutService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("fujian.do")
public class FujianControl {

	@Autowired
	private FujianService fserv;

	@Autowired
	private InhandoutService hserv;

	// ���
	@RequestMapping(params = "method=add")
	@ResponseBody
	public int addFujian(FujianEntity fujian) {
		fujian.setZscount(1);
		this.fserv.addFuijian(fujian);
		// �޸�����
		InhandoutEntity inhandout = this.hserv.getOne(fujian.getInhandoutid());
		inhandout.setInhandoutcount(inhandout.getInhandoutcount() - 1);
		this.hserv.upp(inhandout);
		return 1;
	}

	// ȫ��ѯ
	@RequestMapping(params = "method=all")
	@ResponseBody
	public JSONObject alls(int limit, int offset, int inhandoutid) {
		// ���ж�����
		int count = this.fserv.counts(inhandoutid);
		List<FujianEntity> ar = this.fserv.getAll(offset, limit, inhandoutid);
		JSONObject obj = new JSONObject();
		obj.put("rows", ar);
		obj.put("total", count);
		return obj;
	}

	// ȫ��ѯ
	@RequestMapping(params = "method=all1")
	@ResponseBody
	public JSONObject all(int limit, int offset) {
		// ���ж�����
		int count = this.fserv.count();
		List<FujianEntity> ar = this.fserv.getAll(offset, limit);
		JSONObject obj = new JSONObject();
		obj.put("rows", ar);
		obj.put("total", count);
		return obj;
	}

	// ȫ��ѯ
	@RequestMapping(params = "method=allfujian")
	@ResponseBody
	public List<FujianEntity> getAll() {
		List<FujianEntity> ar = this.fserv.getAll();
		return ar;
	}

	// ȫ��ѯ ͬһ�����µ���Ʒ
	@RequestMapping(params = "method=alls")
	@ResponseBody
	public List<FujianEntity> getAlls(int incarmxid) {
		List<FujianEntity> ar = this.fserv.getAll(incarmxid);
		return ar;
	}

	// ��ѯ
	@RequestMapping(params = "method=one")
	@ResponseBody
	public FujianEntity getOne(int fujianid) {
		FujianEntity ar = this.fserv.getOne(fujianid);
		return ar;
	}

}
