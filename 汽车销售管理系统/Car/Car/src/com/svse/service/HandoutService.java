package com.svse.service;

import java.util.List;

import com.svse.entity.HandoutEntity;

public interface HandoutService {

	// ���
	public void addHandout(HandoutEntity handout);

	// �޸�
	public void uppHandout(HandoutEntity handout);

	// ȫ��ѯ
	public List<HandoutEntity> getAllHandout();
	public List<HandoutEntity> getAllHandout(int begin,int pages);
	
	// ��ѯ����
	public HandoutEntity getOneHandout(int handoutid);

	//�ж��ظ�
	public int repeat(HandoutEntity handout);
	
	//���м�¼
	public int Count();
}
