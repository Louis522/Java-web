package com.svse.dao;

import java.util.List;

import com.svse.entity.AGroupEntity;

public interface AgroupDAOI {

	// ���
	public void add(AGroupEntity agroup);

	// �޸�
	public void upp(AGroupEntity agroup);

	// ɾ��
	public void del(int agroupid);

	// ȫ��ѯ
	public List<AGroupEntity> all();

	public List<AGroupEntity> allagroup(int begin, int pages);

	public AGroupEntity allag(int actionid,int groupid);
	
	// ���м�¼
	public int count();
}
