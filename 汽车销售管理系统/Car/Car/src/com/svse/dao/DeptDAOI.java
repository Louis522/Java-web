package com.svse.dao;

import java.util.List;

import com.svse.entity.DeptEntity;

public interface DeptDAOI {

	// ���
	public void add(DeptEntity dept);

	// �޸�
	public void upp(DeptEntity dept);

	// ȫ��ѯ
	public List<DeptEntity> all();

	
	// ��ѯ����
	public DeptEntity one(int pid);
	
	// ��ѯ����
	public DeptEntity ones(int zjid);
	
	//�ж��ظ�
	public int repeat(DeptEntity dept);
	
}