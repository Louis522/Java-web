package com.svse.service;

import java.util.List;

import com.svse.entity.ActionsEntity;

public interface ActionsService {
	
	//ȫ��ѯ
	public List<ActionsEntity> getAll();
	
	public List<ActionsEntity> getAll(int begin,int pages);
	
	public List<ActionsEntity> getAll(int moduleid);
	
	public int Count();
}
