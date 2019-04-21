package com.svse.dao;

import java.util.List;

import com.svse.entity.InhandoutmxEntity;

public interface InhandoutmxDAOI {

	// ���
	public void add(InhandoutmxEntity inhandoutmx);

	// �޸�
	public void upp(InhandoutmxEntity inhandoutmx);

	// ȫ��ѯ
	public List<InhandoutmxEntity> all();

	// ��ѯ����
	public InhandoutmxEntity one(int inhandoutmxid);

	// ��ҳ��ѯ
	public List<InhandoutmxEntity> all1(int offset, int limit, int inhandoutid);

	// ���м�¼
	public int count(int inhandoutid);

	public List<InhandoutmxEntity> all2(int inhandoutid);

	// Ŀǰ�����
	public Integer getnow(int inhandoutid);

	// �ܿ����
	public Integer getzong(int inhandoutid);

	// ���Ϳ����
	public Integer getfui(int inhandoutid);

	public Integer getbuy(int inhandoutid);
}
