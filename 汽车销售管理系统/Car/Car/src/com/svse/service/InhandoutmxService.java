package com.svse.service;

import java.util.List;

import com.svse.entity.InhandoutmxEntity;

public interface InhandoutmxService {

	// ���
	public void add(InhandoutmxEntity inhandout);

	//��ѯ����
	public InhandoutmxEntity getOne(int inhandoutmxid);
	
	//�޸�
	public void upp(InhandoutmxEntity inhandout);
	
	// ȫ��ѯ
	public List<InhandoutmxEntity> getAll();
	
	public List<InhandoutmxEntity> getAll(int inhandoutid);
	
	public List<InhandoutmxEntity> getAll(int offset,int limit,int inhandoutid);
	
	//���м�¼
	public int count(int inhandoutid);
	
	//Ŀǰ���������ϸ��
	public Integer getnow(int inhandoutid);
	
	//�ܿ����������
	public Integer getzong(int inhandoutid);
	
	//���Ϳ���������ͱ�
	public Integer getfui(int inhandoutid);

	public Integer getBuy(int inhandoutid);
}
