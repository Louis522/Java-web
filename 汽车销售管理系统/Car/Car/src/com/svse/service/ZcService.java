package com.svse.service;

import java.util.List;

import com.svse.entity.ZcEntity;

public interface ZcService {

	// ���
	public void addZc(ZcEntity zc);

	// �޸�
	public void uppZc(ZcEntity zc);

	// ȫ��ѯ
	public List<ZcEntity> getAllZc(int begin,int pages);
	
	// ȫ��ѯ
	public List<ZcEntity> getAllZc();

	// ��ѯ����
	public ZcEntity getOneZc(int zid);
	
	//�ж��ظ�
	public int repeat(ZcEntity Zc);
	
	//���м�¼
	public int Count();
	
}
