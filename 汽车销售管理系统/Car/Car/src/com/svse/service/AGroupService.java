package com.svse.service;

import java.util.List;

import com.svse.entity.AGroupEntity;

public interface AGroupService {
	
	//ȫ��ѯ
	public List<AGroupEntity> getAll();
	
	public List<AGroupEntity> getAll(int begin,int pages);
	
	
	//����actionid��groupid��ѯ
	public AGroupEntity getAllByMid(int actionid,int groupid);
	
	// �޸�
	public void uppAGroup(AGroupEntity agroup);
	
	// ���
	public void addAGroup(AGroupEntity agroup);
	
	// ɾ��
	public void delAGroup(int agroupid);
	
	public int Count();
}
