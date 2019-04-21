package com.svse.dao;

import java.util.List;

import com.svse.entity.ActionsEntity;
import com.svse.entity.MasterAEntity;
import com.svse.entity.MasterEntity;

public interface MasterDAOI {

	// ���
	public void add(MasterEntity master);

	// �޸�
	public void upp(MasterEntity master);

	// ȫ��ѯ
	public List<MasterEntity> all();
	
	// ��ѯ����
	public MasterEntity one(int mid);
	
	//�ж��ظ�
	public int repeat(MasterEntity master);
	
	//��¼
	public MasterEntity login(MasterEntity master);

	//Ȩ��
	public List<ActionsEntity> limit(int mid);
	
	public List<MasterAEntity> limit2(int mid);

	//�õ��ܾ���
	public MasterEntity getone();
	
}