package com.svse.entity;

import java.io.Serializable;
import java.util.List;

public class TzEntity implements Serializable{

	private String name;
	private List data;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	
	
}
