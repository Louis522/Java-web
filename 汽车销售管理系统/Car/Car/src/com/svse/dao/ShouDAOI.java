package com.svse.dao;

import java.util.List;

import com.svse.entity.ShouEntity;

public interface ShouDAOI {
	// ���
	public void add(ShouEntity shou);

	// �޸�
	public void upp(ShouEntity shou);

	// ȫ��ѯ
	public List<ShouEntity> all();

	// ��ѯ����
	public ShouEntity one(int shouhouid);

	// ��ҳ��ѯ
	public List<ShouEntity> all1(int offset, int limit, int mid);

	// ���м�¼
	public int count(int mid);

	public List<ShouEntity> all2(int offset, int limit);

	public int counts();

}
