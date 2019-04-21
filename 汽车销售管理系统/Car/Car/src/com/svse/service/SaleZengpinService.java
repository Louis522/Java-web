package com.svse.service;

import java.util.List;

import com.svse.entity.SaleZengpinEntity;

public interface SaleZengpinService {

	// ���
	public void addSaleZengpin(SaleZengpinEntity SaleZengpin);

	// �޸�
	public void uppSaleZengpin(SaleZengpinEntity SaleZengpin);

	// ȫ��ѯ
	public List<SaleZengpinEntity> getAll();
	
	public List<SaleZengpinEntity> getAll(int offset, int limit);

	public List<SaleZengpinEntity> getAll(int offset, int limit,int inhandoutid);

	// ��ѯ����
	public SaleZengpinEntity getOne(int salezpid);

	// ���м�¼
	public int count(int inhandoutid);
	public int counts();

	public List<SaleZengpinEntity> getAlls(int offset, int limit);
}
