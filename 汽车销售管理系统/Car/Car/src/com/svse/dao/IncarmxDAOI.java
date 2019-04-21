package com.svse.dao;

import java.util.List;

import com.svse.entity.InCarmxEntity;

public interface IncarmxDAOI {

	// ���
	public void add(InCarmxEntity incarmx);

	// ȫ��ѯ
	public List<InCarmxEntity> all();

	// ��ҳ��ѯ
	public List<InCarmxEntity> all1(int offset, int limit, int incarid);

	// ���м�¼
	public int count(int incarid);

	// �ж��ظ�
	public int rea(InCarmxEntity incarmx);

	// �õ����
	public List<InCarmxEntity> all2(int incarid);

	public InCarmxEntity one(int incarmxid);

	// �޸�
	public void upp(InCarmxEntity incarmx);

	// ������ѯ��ϵ�У�
	public List<InCarmxEntity> alllimit2(int detailid,int limit, int offset);
	public int counts2(int detailid);
	
	// ������ѯ��״̬��
	public List<InCarmxEntity> alllimit1(int flag,int limit, int offset);
	public int counts1(int flag);
	
	// ������ѯ��ϵ�С�״̬��
	public List<InCarmxEntity> alllimit(int detailid, int flag,int limit, int offset);
	public int counts(int detailid, int flag);
	
	//��ҳ��ѯ
	public List<InCarmxEntity> limit(int offset, int limit);

	public int allcount();

}
