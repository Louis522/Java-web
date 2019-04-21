package com.svse.dao;

import java.util.List;

import com.svse.entity.PurchaseEntity;

public interface PurchaseDAOI {

	// ���
	public void add(PurchaseEntity purchase);

	// �޸�
	public void upp(PurchaseEntity purchase);

	// ȫ��ѯ
	public List<PurchaseEntity> all();

	public List<PurchaseEntity> allpurchase(int begin, int pages, int mid);
	
	public List<PurchaseEntity> all1(int begin, int pages, int mid);
	
	public List<PurchaseEntity> all2(int begin, int pages,int purchaseflag, int mid);
	
	// ��ѯ����
	public PurchaseEntity one(int purchaseid);
	
	
	// ���м�¼
	public int count(int mid);
	
	public int count1(int mid);
	
	public int count2(int purchaseflag,int mid);
	
	public int count3(int mid);
	
	public int last();

	public int getcount(int mid);

	public List<PurchaseEntity> all3(int begin, int pages, int mid);


}
