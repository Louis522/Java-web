package com.svse.dao;

import java.util.List;

import com.svse.entity.MasterAEntity;

public interface MasterADAOI {

	// ���
	public void add(MasterAEntity MasterA);

	// �޸�
	public void upp(MasterAEntity MasterA);

	// ɾ��
	public void del(int actiongroupid);

	// ȫ��ѯ
	public List<MasterAEntity> all();

	public List<MasterAEntity> allMasterA(int begin, int pages);

	public MasterAEntity allmg(int mid,int groupid);
	
	// ���м�¼
	public int count();
}
