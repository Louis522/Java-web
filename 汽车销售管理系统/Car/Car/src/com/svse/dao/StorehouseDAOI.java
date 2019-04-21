package com.svse.dao;

import java.util.List;

import com.svse.entity.StorehouseEntity;

public interface StorehouseDAOI {

	// ���
	public void add(StorehouseEntity storehouse);

	// �޸�
	public void upp(StorehouseEntity storehouse);

	// ȫ��ѯ
	public List<StorehouseEntity> all();
	public List<StorehouseEntity> allstore(int begin,int pages);
	
	// ��ѯ����
	public StorehouseEntity one(int storeid);
	
	//�ж��ظ�
	public int repeat(StorehouseEntity storehouse);
	
	//���м�¼
	public int count();
}