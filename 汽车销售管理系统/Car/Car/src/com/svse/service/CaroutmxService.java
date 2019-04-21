package com.svse.service;

import java.util.List;

import com.svse.entity.CaroutmxEntity;

public interface CaroutmxService {

	// ���
	public void addCarout(CaroutmxEntity carout);

	// �޸�
	public void uppCarout(CaroutmxEntity carout);

	// ȫ��ѯ
	public List<CaroutmxEntity> getAll();

	public List<CaroutmxEntity> getAll(int offset, int limit);
	
	public List<CaroutmxEntity> getBySort(int sortid);
	
	// ��ѯ����
	public CaroutmxEntity getOne(int catoutmxid);

	//���м�¼
	public int count();
	
	//�õ�Last
	public int last();
	
}
