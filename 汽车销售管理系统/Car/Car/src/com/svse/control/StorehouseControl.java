package com.svse.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svse.entity.StorehouseEntity;
import com.svse.service.StorehouseService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("storehouse.do")
public class StorehouseControl {

	@Autowired
	private StorehouseService shserv;

	// ���
	@RequestMapping(params = "method=add")
	@ResponseBody
	public int addsort(StorehouseEntity storehouse) {
		this.shserv.addStorehouse(storehouse);
		return 1;
	}

	// �����޸�
	@RequestMapping(params = "method=upp")
	@ResponseBody
	public int uppsort(StorehouseEntity store) {
		this.shserv.uppStorehouse(store);
		return 1;
	}


	// ȫ��ѯ
	@RequestMapping(params="method=all")
	@ResponseBody
	public JSONObject all(int limit,int offset)
	{	
		//���ж�����
		int count=this.shserv.Count();
		//��ҳ��ѯ
		List<StorehouseEntity> ar=this.shserv.getAllStorehouse(offset, limit);
		
		JSONObject obj=new JSONObject();
		
		obj.put("rows", ar);
		obj.put("total", count);
		
		return obj;
	}
	
	@RequestMapping(params="method=alls")
	@ResponseBody
	public List<StorehouseEntity> all()
	{	
		List<StorehouseEntity> ar=this.shserv.getAllStorehouse();
		
		
		return ar;
	}

	// ��ѯ����
	@RequestMapping(params = "method=one")
	@ResponseBody
	public StorehouseEntity getOnesort(int storeid) {
		StorehouseEntity store = this.shserv.getOneStorehouse(storeid);
		return store;
	}

	// �ж��ظ�
	@RequestMapping(params = "method=repeat")
	@ResponseBody
	public int repeat(String name,String old) {
		StorehouseEntity store = new StorehouseEntity();
		store.setStorename(name);
		int t = this.shserv.repeat(store);
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
