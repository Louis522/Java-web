package com.svse.dao;

import java.util.List;

import com.svse.entity.HandoutEntity;
import com.svse.entity.InhandoutEntity;
public interface InhandoutDAOI {
	// ���
	public void add(InhandoutEntity inhandout);

	// �޸�
	public void upp(InhandoutEntity inhandout);

	// ȫ��ѯ
	public List<InhandoutEntity> all();

	// ��ѯ����
	public InhandoutEntity one(int inhandoutid);

	// ��ҳ��ѯ
	public List<InhandoutEntity> all1(int offset, int limit);

	//��ѯ��Ʒ
	public List<HandoutEntity> allh();
	
	// ���м�¼
	public int count();

	//�õ�ID
	public int getid();

	public List<InhandoutEntity> alls();
}
