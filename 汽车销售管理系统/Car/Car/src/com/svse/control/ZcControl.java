package com.svse.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svse.entity.ActionsEntity;
import com.svse.entity.ZcEntity;
import com.svse.service.ZcService;
import com.svse.util.MyPages;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("zc.do")
public class ZcControl {

	@Autowired
	private ZcService zserv;

	// ���
	@RequestMapping(params = "method=add")
	@ResponseBody
	public int addZc(ZcEntity Zc) {
		this.zserv.addZc(Zc);
		return 1;
	}

	// �����޸�
	@RequestMapping(params = "method=upp")
	@ResponseBody
	public int uppZc(ZcEntity Zc) {
		this.zserv.uppZc(Zc);
		return 1;
	}


	// ȫ��ѯ
	@RequestMapping(params = "method=all")
	@ResponseBody
	public JSONObject all(int limit, int offset) {
		// ���ж�����
		int count = this.zserv.Count();
		// ��ҳ��ѯ
		List<ZcEntity> ar = this.zserv.getAllZc(offset, limit);
		
		JSONObject obj = new JSONObject();

		obj.put("rows", ar);
		obj.put("total", count);

		return obj;
	}
	
	@RequestMapping(params = "method=allzc")
	@ResponseBody
	public List<ZcEntity> getAll(){
		List<ZcEntity> ar=this.zserv.getAllZc();
		return ar;
	} 
	

	// ��ѯ����
	@RequestMapping(params = "method=one")
	@ResponseBody
	public ZcEntity getOneZc(int zid) {
		ZcEntity Zc = this.zserv.getOneZc(zid);
		return Zc;
	}

	// �ж��ظ�
	@RequestMapping(params = "method=repeat")
	@ResponseBody
	public int repeat(String zname,String old) {
		ZcEntity Zc = new ZcEntity();
		Zc.setZname(zname);
		int t = this.zserv.repeat(Zc);
		if (t > 0) {
			if(old!=null && old.equalsIgnoreCase(zname)){
				return 2;
			}else{
				// �ظ�
				return 1;
			}
		} else {
			return 2;
		}
	}

}
