package com.svse.service;

import java.util.List;

import com.svse.entity.HandoutEntity;
import com.svse.entity.InhandoutEntity;

public interface InhandoutService {

	// ���
	public void add(InhandoutEntity inhandout);

	// ȫ��ѯ
	public List<InhandoutEntity> getAll();
	
	//��ѯ�п�����Ʒ��
	public List<InhandoutEntity> getAlls();
	public List<InhandoutEntity> getAll(int offset,int limit);
	
	//�޸�
	public void upp(InhandoutEntity inhandout);
	
	//��ѯ��Ʒ
	public List<HandoutEntity> allh();
	
	//��ѯ����
	public InhandoutEntity getOne(int inhandoutid);
	
	//���м�¼
	public int count();
	
	//�õ�inhandoutid
	public int getID();
}
