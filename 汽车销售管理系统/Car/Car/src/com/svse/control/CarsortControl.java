package com.svse.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svse.entity.CarsortEntity;
import com.svse.service.CarsortService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("sort.do")
public class CarsortControl {

	@Autowired
	private CarsortService sserv;

	// ���
	@RequestMapping(params = "method=add")
	@ResponseBody
	public int addsort(CarsortEntity sort) {
		this.sserv.addCarsort(sort);
		return 1;
	}

	// �����޸�
	@RequestMapping(params = "method=upp")
	@ResponseBody
	public int uppsort(CarsortEntity sort) {
		this.sserv.uppCarsort(sort);
		return 1;
	}
	
	@RequestMapping(params="method=alls")
	@ResponseBody
	public List<CarsortEntity> getAll(){
		List<CarsortEntity> ar=this.sserv.getAllCarsort();
		return ar;
	}
	// ȫ��ѯ
	@RequestMapping(params="method=all")
	@ResponseBody
	public JSONObject all(int limit,int offset)
	{
		//���ж�����
		int count=this.sserv.Count();
		//��ҳ��ѯ
		List<CarsortEntity> ar=this.sserv.getAllCarsort(offset, limit);
		
		JSONObject obj=new JSONObject();
		
		obj.put("rows", ar);
		obj.put("total", count);
		
		return obj;
	}


	// ��ѯ����
	@RequestMapping(params = "method=one")
	@ResponseBody
	public CarsortEntity getOnesort(int sortid) {
		CarsortEntity sort = this.sserv.getOneCarsort(sortid);
		return sort;
	}

	// �ж��ظ�
	@RequestMapping(params = "method=repeat")
	@ResponseBody
	public int repeat(String name,String old) {
		CarsortEntity sort = new CarsortEntity();
		sort.setSortname(name);
		int t = this.sserv.repeat(sort);
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
