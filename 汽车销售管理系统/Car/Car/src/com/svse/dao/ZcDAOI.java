package com.svse.dao;

import java.util.List;

import com.svse.entity.ZcEntity;

public interface ZcDAOI {

	// ���
	public void addZc(ZcEntity Zc);

	// �޸�
	public void uppZc(ZcEntity Zc);

	// ȫ��ѯ
	public List<ZcEntity> allZc(int begin,int pages);
	public List<ZcEntity> all();
	
	// ��ѯ����
	public ZcEntity oneZc(int zid);
	
	//�ж��ظ�
	public int repeatZc(ZcEntity Zc);
	
	//���м�¼
	public int Count();

	
}