package com.svse.service;

import java.util.List;

import com.svse.entity.CarsortEntity;

public interface CarsortService {

	// ���
	public void addCarsort(CarsortEntity carsort);

	// �޸�
	public void uppCarsort(CarsortEntity carsort);

	// ȫ��ѯ
	public List<CarsortEntity> getAllCarsort();
	public List<CarsortEntity> getAllCarsort(int begin,int pages);
	
	// ��ѯ����
	public CarsortEntity getOneCarsort(int sortid);

	//�ж��ظ�
	public int repeat(CarsortEntity carsort);
	
	//���м�¼
	public int Count();
}
