package com.svse.dao;

import java.util.List;

import com.svse.entity.CarsortEntity;

public interface CarsortDAOI {

	// ���
	public void add(CarsortEntity carsort);

	// �޸�
	public void upp(CarsortEntity carsort);

	// ȫ��ѯ
	public List<CarsortEntity> all();
	public List<CarsortEntity> allsort(int begin,int pages);
	
	// ��ѯ����
	public CarsortEntity one(int sortid);
	
	//�ж��ظ�
	public int repeat(CarsortEntity carsort);
	
	//���м�¼
	public int count();
}