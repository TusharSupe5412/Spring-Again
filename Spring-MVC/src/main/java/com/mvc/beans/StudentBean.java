package com.mvc.beans;

import java.util.List;

public class StudentBean {

	String id ;
	String name;
	String phones;
	
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentBean(String id, String name, String phones) {
		super();
		this.id = id;
		this.name = name;
		this.phones = phones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhones() {
		return phones;
	}

	public void setPhones(String phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", phones=" + phones + "]";
	}

	
	
	
	
	
	
}
