package com.svse.service;

import java.util.List;

import com.svse.entity.FujianEntity;

public interface FujianService {

	// ���
	public void addFuijian(FujianEntity fujian);

	// �޸�
	public void uppFuijian(FujianEntity fujian);

	// ȫ��ѯ
	public List<FujianEntity> getAll();

	public List<FujianEntity> getAll(int offset, int limit,int inhandoutid);

	public List<FujianEntity> getAll(int offset, int limit);
	
	// ��ѯ����
	public FujianEntity getOne(int fjid);

	// ���м�¼
	public int count();
	
	public int counts(int inhandoutid);

	public List<FujianEntity> getAll(int incarmxid);

	public List<FujianEntity> getAlls(int offset, int limit);
	
}
