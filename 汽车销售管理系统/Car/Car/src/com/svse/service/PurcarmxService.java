package com.svse.service;

import java.util.List;

import com.svse.entity.PurcarmxEntity;

public interface PurcarmxService {
	
		// ���
		public void addPurcarmx(PurcarmxEntity purcarmx);

		// ɾ��
		public void delPurcarmx(int purchaseid);

		// ȫ��ѯ
		public List<PurcarmxEntity> getAllPurcarmx(int begin,int pages);
		
		public List<PurcarmxEntity> getAllPurcarmx(int purchaseid);
		
		// ��ѯ����
		public List<PurcarmxEntity> getOnePurcarmx(int Purcarmxid);

		//���м�¼
		public int Count();
		
}
