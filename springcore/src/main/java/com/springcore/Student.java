package com.springcore;

public class Student {
	
	private int id;
	private String name;
	private String studentAddress;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String studentAddress) {
		super();
		this.id = id;
		this.name = name;
		this.studentAddress = studentAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentAddress=" + studentAddress + "]";
	}
	

}
