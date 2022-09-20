package com.springcore.standalone.collection;

import java.util.List;

public class Person {

	private List<String> firstName;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(List<String> firstName) {
		super();
		this.firstName = firstName;
	}

	public List<String> getFirstName() {
		return firstName;
	}

	public void setFirstName(List<String> firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + "]";
	}
	
	
	
	
}
