package com.svse.service;

import java.util.List;

import com.svse.entity.DeptEntity;
import com.svse.entity.GwEntity;

public interface GwService {

	// ���
	public void addGw(GwEntity gw);

	// �޸�
	public void uppGw(GwEntity gw);

	// ȫ��ѯ
	public List<GwEntity> getAllGw();

	// ��ѯ����
	public GwEntity getOneGw(int gid);

	// ��ѯ�ò����¸�λ
	public List<GwEntity> getGwbyPid(int pid);

	public int repeat(GwEntity gw);
	
	
}
