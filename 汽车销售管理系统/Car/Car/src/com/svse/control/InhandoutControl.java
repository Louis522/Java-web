package com.svse.control;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svse.entity.HandoutEntity;
import com.svse.entity.InhandoutEntity;
import com.svse.service.InhandoutService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("inhandout.do")
public class InhandoutControl {

	@Autowired
	private InhandoutService ihserv;
	

	// ���
	@RequestMapping(params = "method=add")
	@ResponseBody
	public int addInhandout(InhandoutEntity Inhandout) {
		Inhandout.setInhandoutcount(0);
		Inhandout.setInhandoutflag(0);
		this.ihserv.add(Inhandout);
		return 1;
	}


	// �޸�
	@RequestMapping(params = "method=upp")
	@ResponseBody
	public int uppInhandout(InhandoutEntity Inhandout) {
		InhandoutEntity ih = this.ihserv.getOne(Inhandout.getInhandoutid());
		ih.setInhandoutcount(Inhandout.getInhandoutcount());
		ih.setInhandoutflag(1);
		this.ihserv.upp(ih);
		return 1;
	}

	// ȫ��ѯ
	@RequestMapping(params = "method=all")
	@ResponseBody
	public JSONObject all(int limit, int offset) {
		// ���ж�����
		int count = this.ihserv.count();
		List<InhandoutEntity> ar = this.ihserv.getAll(offset, limit);
		JSONObject obj = new JSONObject();
		obj.put("rows", ar);
		obj.put("total", count);
		return obj;
	}
	//��ѯ����������Ʒ
	@RequestMapping(params = "method=allinhandout")
	@ResponseBody
	public List<InhandoutEntity> getAll() {
		List<InhandoutEntity> ar = this.ihserv.getAll();
		return ar;
	}
	//��ѯ�п�����Ʒ
	@RequestMapping(params = "method=alls")
	@ResponseBody
	public List<InhandoutEntity> getAlls() {
		List<InhandoutEntity> ar = this.ihserv.getAlls();
		return ar;
	}

	// ��ѯ����
	@RequestMapping(params = "method=one")
	@ResponseBody
	public InhandoutEntity getOneInhandout(int inhandoutid) {
		InhandoutEntity Inhandout = this.ihserv.getOne(inhandoutid);
		return Inhandout;
	}
	
	//��ѯ��Ʒ
	@RequestMapping(params = "method=allh")
	@ResponseBody
	public List<HandoutEntity> getAllh() {
		List<HandoutEntity> ar=this.ihserv.allh();
		return ar;
	}
	
	//�õ�ID
	@RequestMapping(params = "method=last")
	@ResponseBody
	public int getId() {
		int a=this.ihserv.getID();
		return a;
	}
}
