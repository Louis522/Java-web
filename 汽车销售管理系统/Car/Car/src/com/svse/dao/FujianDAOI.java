package com.svse.dao;

import java.util.List;

import com.svse.entity.FujianEntity;

public interface FujianDAOI {

	// ���
	public void add(FujianEntity fujian);

	// �޸�
	public void upp(FujianEntity fujian);

	// ȫ��ѯ
	public List<FujianEntity> allfujian();

	public List<FujianEntity> all(int offset, int limit);

	// ��ѯ����
	public FujianEntity one(int fjid);

	// ���м�¼
	public int count();

	public List<FujianEntity> alls(int incarmxid);

	public List<FujianEntity> all1(int offset, int limit, int inhandoutid);

	public int counts(int inhandoutid);

	public List<FujianEntity> saleall(int offset, int limit);

}
