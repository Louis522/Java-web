package com.svse.dao;

import java.util.List;

import com.svse.entity.CardetailEntity;
import com.svse.entity.InCarEntity;

public interface IncarDAOI {

	// ���
	public void add(InCarEntity incar);

	// �޸�
	public void upp(InCarEntity incar);

	// ȫ��ѯ
	public List<InCarEntity> all();

	// ��ѯ����
	public InCarEntity one(int incarid);

	// ��ҳ��ѯ
	public List<InCarEntity> all1(int offset, int limit);

	// ���м�¼
	public int count();

	public List<CardetailEntity> all2();
}
