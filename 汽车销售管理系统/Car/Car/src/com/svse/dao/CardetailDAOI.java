package com.svse.dao;

import java.util.List;

import com.svse.entity.CardetailEntity;

public interface CardetailDAOI {

	// ���
	public void add(CardetailEntity cardetail);

	// �޸�
	public void upp(CardetailEntity cardetail);

	// ȫ��ѯ
	public List<CardetailEntity> alldetail(int begin,int pages);
	public List<CardetailEntity> all();
	// ��ѯ����
	public CardetailEntity one(int detailid);
	
	//���м�¼
	public int count();

	public List<CardetailEntity> allbysort(int sortid);
}