package com.svse.service;

import java.util.List;

import com.svse.entity.MasterAEntity;

public interface MasterAService {
	
	//ȫ��ѯ
	public List<MasterAEntity> getAll();
	
	public List<MasterAEntity> getAll(int begin,int pages);
	
	
	//����mid��groupid��ѯ
	public MasterAEntity getAllByMid(int mid,int groupid);
	
	// �޸�
	public void uppMasterA(MasterAEntity MasterA);
	
	// ���
	public void addMasterA(MasterAEntity MasterA);
	
	// ɾ��
	public void delMasterA(int MasterAid);
	
	public int Count();
}
