package com.svse.service;

import java.util.List;

import com.svse.entity.ShouEntity;

public interface ShouhouService {

	// ���
	public void add(ShouEntity shou);

	// ���
	public void upp(ShouEntity shou);

	// ȫ��ѯ
	public List<ShouEntity> getAll();
	public List<ShouEntity> getAlls(int offset, int limit);
	public List<ShouEntity> getAll(int offset, int limit,int mid);

	// ��ѯ����
	public ShouEntity getOne(int shouhouid);

	// ���м�¼
	public int count(int mid);
	
	public int counts();

}
