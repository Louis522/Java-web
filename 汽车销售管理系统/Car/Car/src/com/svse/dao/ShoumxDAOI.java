package com.svse.dao;

import java.util.List;

import com.svse.entity.ShoumxEntity;

public interface ShoumxDAOI {
	// ���
	public void add(ShoumxEntity shoumx);

	// �޸�
	public void upp(ShoumxEntity shoumx);

	// ȫ��ѯ
	public List<ShoumxEntity> all();

	// ��ѯ����
	public ShoumxEntity one(int shouhoumxid);

	// ��ҳ��ѯ
	public List<ShoumxEntity> all1(int offset, int limit,int shouhouid);

	// ���м�¼
	public int count(int shouhouid);

}
