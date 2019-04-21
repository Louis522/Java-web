package com.svse.dao;

import java.util.List;

import com.svse.entity.SaleZengpinEntity;

public interface SaleZengpinDAOI {

	// ���
	public void add(SaleZengpinEntity salezp);

	// �޸�
	public void upp(SaleZengpinEntity salezp);

	// ȫ��ѯ
	public List<SaleZengpinEntity> allsalezp();

	public List<SaleZengpinEntity> all(int offset, int limit, int inhandoutid);

	// ��ѯ����
	public SaleZengpinEntity one(int salezpid);

	// ���м�¼
	public int count(int inhandoutid);

	public List<SaleZengpinEntity> alls(int offset, int limit);

	public int counts();

	public List<SaleZengpinEntity> saleall(int offset, int limit);

}
