package com.svse.service;

import java.util.List;

import com.svse.entity.ActionsEntity;
import com.svse.entity.MasterAEntity;
import com.svse.entity.MasterEntity;

public interface MasterService {
	
	//��¼
	public MasterEntity login(String mname,String mpsw);
	
	//�ж��û����Ƿ����
	public int find(String mname);
	
	//���Ȩ��
	public List<ActionsEntity> getLimit(int mid);
	
	public List<MasterAEntity> getLimit2(int mid);
	
	// ���
	public void addMaster(MasterEntity master);

	// �޸�
	public void uppMaster(MasterEntity master);

	// ȫ��ѯ
	public List<MasterEntity> getAllMaster();

	// ��ѯ����
	public MasterEntity getOneMaster(int mid);

	//�ж��ظ�
	public int repeat(MasterEntity master);
	
	//���м�¼
	public int Count();
	
	//��ѯ�ܾ���
	public MasterEntity getOneByPid();
	
	
}
