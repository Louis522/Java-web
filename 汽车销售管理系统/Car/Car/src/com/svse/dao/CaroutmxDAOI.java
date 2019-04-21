package com.svse.dao;

import java.util.List;

import com.svse.entity.CaroutmxEntity;

public interface CaroutmxDAOI {

	// ���
	public void add(CaroutmxEntity caroutmx);

	// �޸�
	public void upp(CaroutmxEntity caroutmx);

	// ȫ��ѯ
	public List<CaroutmxEntity> allcarout();

	public List<CaroutmxEntity> all(int offset, int limit);

	// ��ѯ����
	public CaroutmxEntity one(int incarmxid);

	// ���м�¼
	public int count();

	public int last();

	public List<CaroutmxEntity> getBySort(int sortid); 

}
