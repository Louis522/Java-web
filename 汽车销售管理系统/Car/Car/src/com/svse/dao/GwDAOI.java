package com.svse.dao;

import java.util.List;

import com.svse.entity.DeptEntity;
import com.svse.entity.GwEntity;

public interface GwDAOI {

	// ���
	public void add(GwEntity gw);

	// �޸�
	public void upp(GwEntity gw);

	// ȫ��ѯ
	public List<GwEntity> all();
	
	// ȫ��ѯ
	public List<GwEntity> alldept(int pid);

	// ��ѯ����
	public GwEntity one(int gid);
	
	//�ж��ظ�
	public int repeat(GwEntity gw);
	
}