package com.svse.service;

import java.util.List;

import com.svse.entity.StorehouseEntity;

public interface StorehouseService {

	// ���
	public void addStorehouse(StorehouseEntity storehouse);

	// �޸�
	public void uppStorehouse(StorehouseEntity storehouse);

	// ȫ��ѯ
	public List<StorehouseEntity> getAllStorehouse();
	public List<StorehouseEntity> getAllStorehouse(int begin,int pages);
	
	// ��ѯ����
	public StorehouseEntity getOneStorehouse(int storeid);

	//�ж��ظ�
	public int repeat(StorehouseEntity storehouse);
	
	//���м�¼
	public int Count();
}
