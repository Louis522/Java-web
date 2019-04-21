package com.svse.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svse.entity.HandoutEntity;
import com.svse.service.HandoutService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("handout.do")
public class HandoutControl {

	@Autowired
	private HandoutService hserv;

	// ���
	@RequestMapping(params = "method=add")
	@ResponseBody
	public int addsort(HandoutEntity handout) {
		this.hserv.addHandout(handout);
		return 1;
	}

	// �����޸�
	@RequestMapping(params = "method=upp")
	@ResponseBody
	public int uppsort(HandoutEntity handout) {
		this.hserv.uppHandout(handout);
		return 1;
	}


	// ȫ��ѯ
	@RequestMapping(params="method=all")
	@ResponseBody
	public JSONObject all(int limit,int offset)
	{
		//���ж�����
		int count=this.hserv.Count();
		//��ҳ��ѯ
		List<HandoutEntity> ar=this.hserv.getAllHandout(offset, limit);
		
		JSONObject obj=new JSONObject();
		
		obj.put("rows", ar);
		obj.put("total", count);
		
		return obj;
	}


	// ��ѯ����
	@RequestMapping(params = "method=one")
	@ResponseBody
	public HandoutEntity getOnesort(int handoutid) {
		HandoutEntity handout = this.hserv.getOneHandout(handoutid);
		return handout;
	}

	// �ж��ظ�
	@RequestMapping(params = "method=repeat")
	@ResponseBody
	public int repeat(String name,String old) {
		HandoutEntity handout = new HandoutEntity();
		handout.setHandoutname(name);
		int t = this.hserv.repeat(handout);
		if (t > 0) {
			if(old!=null && old.equalsIgnoreCase(name)){
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
