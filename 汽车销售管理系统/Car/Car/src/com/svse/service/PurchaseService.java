package com.svse.service;

import java.util.List;

import com.svse.entity.PurchaseEntity;

public interface PurchaseService {
	
		// ���
		public void addPurchase(PurchaseEntity purchase);

		// �޸�
		public void uppPurchase(PurchaseEntity purchase);

		// ȫ��ѯ
		public List<PurchaseEntity> getAllPurchase(int begin,int pages, int mid);
		
		public List<PurchaseEntity> getAllPurchase();
		
		// ��ѯ����
		public PurchaseEntity getOnePurchase(int purchaseid);

		//���м�¼
		public int Count(int mid);
		
		public int Count1(int mid);
		
		public int Count2(int purchaseflag,int mid);
		
		public int Count3(int mid);
		
		//������ѯ
		public List<PurchaseEntity> getAll(int offset, int limit, int purchaseflag, int mid);
		
		public List<PurchaseEntity> getAll(int offset, int limit, int mid);

		public int getOnePurchase();


		public int getCount(int mid);

		public List<PurchaseEntity> getAlls(int offset, int limit, int mid);
}
