package com.svse.dao;

import java.util.List;

import com.svse.entity.HandoutEntity;

public interface HandoutDAOI {

	// ���
	public void add(HandoutEntity handout);

	// �޸�
	public void upp(HandoutEntity handout);

	// ȫ��ѯ
	public List<HandoutEntity> all();
	public List<HandoutEntity> allhandout(int begin,int pages);
	
	// ��ѯ����
	public HandoutEntity one(int handoutid);
	
	//�ж��ظ�
	public int repeat(HandoutEntity handout);
	
	//���м�¼
	public int count();
}