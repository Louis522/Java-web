package com.svse.dao;

import java.util.List;

import com.svse.entity.GroupEntity;

public interface GroupDAOI {

	// ���
	public void add(GroupEntity group);

	// �޸�
	public void upp(GroupEntity group);

	// ȫ��ѯ
	public List<GroupEntity> all();
	public List<GroupEntity> allgroup(int begin,int pages);
	
	// ��ѯ����
	public GroupEntity one(int groupid);
	
	//�ж��ظ�
	public int repeat(GroupEntity group);
	
	//���м�¼
	public int count();
}