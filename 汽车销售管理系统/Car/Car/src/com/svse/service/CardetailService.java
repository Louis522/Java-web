package com.svse.service;

import java.util.List;

import com.svse.entity.CardetailEntity;

public interface CardetailService {

	// ���
	public void addCardetail(CardetailEntity cardetail);

	// �޸�
	public void uppCardetail(CardetailEntity cardetail);

	// ȫ��ѯ
	public List<CardetailEntity> getAllCardetail(int begin,int pages);
	
	public List<CardetailEntity> getAllCardetail();
	
	//����Ʒ�Ʋ�ϵ��
	public List<CardetailEntity> getAllBySort(int sortid);
	
	// ��ѯ����
	public CardetailEntity getOneCardetail(int detailid);

	//���м�¼
	public int Count();
}

