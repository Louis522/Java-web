package com.svse.service;

import java.util.List;

import com.svse.entity.InCarmxEntity;

public interface IncarmxService {

	// ���
	public void add(InCarmxEntity incarmx);

	// ȫ��ѯ
	public List<InCarmxEntity> getAll();

	// ���м�¼
	public int count(int incarid);

	public List<InCarmxEntity> getAll(int incarid);

	public List<InCarmxEntity> getAll(int offset, int limit, int incarmxid);
	
	//ȫ��ѯ
	public List<InCarmxEntity> getAll(int offset, int limit);
	public int allcount();
	
	// ������ѯ��״̬��ϵ�У�
	public List<InCarmxEntity> getAllLimit(int limit, int offset,int detailid, int flag);
	public int counts(int detailid, int flag);

	// ״̬
	public List<InCarmxEntity> getAllLimit1(int limit, int offset,int flag);
	public int counts1(int flag);

	// ϵ��
	public List<InCarmxEntity> getAllLimit2(int limit, int offset,int detailid);
	public int counts2(int detailid);

	// �ж��ظ�
	public int Rea(InCarmxEntity incarmx);

	public InCarmxEntity getOne(int incarmcid);

	// �޸�
	public void upp(InCarmxEntity incarmx);

}
