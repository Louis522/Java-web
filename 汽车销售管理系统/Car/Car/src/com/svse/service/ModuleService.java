package com.svse.service;

import java.util.List;

import com.svse.entity.ModuleEntity;

public interface ModuleService {
	
	//ȫ��ѯ
	public List<ModuleEntity> getAllModule();
	
	public List<ModuleEntity> getAllModule(int begin,int pages);
	
	public int Count();
}
