package com.svse.service;

import java.util.List;

import com.svse.entity.CustomEntity;

public interface CustomService {

	// ���
	public void addCustom(CustomEntity custom);

	// ȫ��ѯ
	public List<CustomEntity> getAll();
	public List<CustomEntity> getAlls(int mid);
	public List<CustomEntity> getAll(int offset,int limit);
	
	//Ȩ��
	public List<CustomEntity> getLimit1(int offset,int limit,int pid);
	public int count1(int pid);
	//Ȩ��
	public List<CustomEntity> getLimit2(int offset,int limit,int mid);
	public List<CustomEntity> getAll(int mid);
	public int count2(int mid);
	// ���м�¼
	public int count();

	// �ж��ظ�
	public int repeat(CustomEntity custom);

	
}
