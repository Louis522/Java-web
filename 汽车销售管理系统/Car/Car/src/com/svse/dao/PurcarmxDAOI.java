package com.svse.dao;

import java.util.List;

import com.svse.entity.PurcarmxEntity;

public interface PurcarmxDAOI {

	// ���
	public void add(PurcarmxEntity purcarmx);

	// ɾ��
	public void del(int purchaseid);

	// ȫ��ѯ
	public List<PurcarmxEntity> all(int purchaseid);

	public List<PurcarmxEntity> allpurcarmx(int begin, int pages);

	// ���ݲɹ���ѯ
	public List<PurcarmxEntity> one(int purchaseid);

	// ���м�¼
	public int count();

}
