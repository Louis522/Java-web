package com.svse.dao;

import java.util.List;

import com.svse.entity.CustomEntity;

public interface CustomDAOI {

	//���
	public void add(CustomEntity custom);
	
	//ȫ��ѯ
	public List<CustomEntity> all(int mid);

	public List<CustomEntity> all1(int offset, int limit);
	
	//���м�¼
	public int count();

	//�ж��ظ�
	public int repeat(CustomEntity custom);

	public List<CustomEntity> limit1(int offset, int limit, int pid);

	public int count1(int pid);

	//Ȩ��
	public List<CustomEntity> limit2(int offset, int limit, int mid);
	public List<CustomEntity> alllimit(int mid);
	public int count2(int mid);

	public List<CustomEntity> getall();
	
}
