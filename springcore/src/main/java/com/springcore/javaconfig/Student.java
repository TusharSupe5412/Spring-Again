package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("Tushar Supe")
	private String name;
	
	@Value("Kalyan")
	private String address;

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
	

}
