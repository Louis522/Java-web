package com.svse.service;

import java.util.List;

import com.svse.entity.ShoumxEntity;

public interface ShoumxService {

	// ���
	public void add(ShoumxEntity shoumx);

	// ���
	public void upp(ShoumxEntity shoumx);

	// ȫ��ѯ
	public List<ShoumxEntity> getAll();

	public List<ShoumxEntity> getAll(int offset, int limit,int shouhouid);

	// ��ѯ����
	public ShoumxEntity getOne(int shouhoumxid);

	// ���м�¼
	public int count(int shouhouid);

}
