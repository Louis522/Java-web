package com.svse.service;

import java.util.List;

import com.svse.entity.DeptEntity;

public interface DeptService {

	// ���
	public void addDept(DeptEntity dept);

	// �޸�
	public void uppDept(DeptEntity dept);

	// ȫ��ѯ
	public List<DeptEntity> getAllDept();

	// ��ѯ����
	public DeptEntity getOneDept(int pid);
	
	// ��ѯ����
	public DeptEntity getOneDepts(int zjid);

	//�ж��ظ�
	public int repeat(DeptEntity dept);
}
