package com.svse.service;

import java.util.List;

import com.svse.entity.CardetailEntity;
import com.svse.entity.InCarEntity;

public interface IncarService {

	// ���
	public void add(InCarEntity incar);
	
	// ���
	public void upp(InCarEntity incar);

	// ȫ��ѯ
	public List<InCarEntity> getAll();
	
	public List<InCarEntity> getAll(int offset,int limit);
	
	//��ѯ����
	public InCarEntity getOne(int incarid);
	
	//���м�¼
	public int count();

	//��ѯ����
	public List<CardetailEntity> alld();

}
