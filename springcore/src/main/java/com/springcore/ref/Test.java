package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
	
	A a = (A) context.getBean("aref");
	
	System.out.println(a.getX());
	System.out.println(a.getOb().getY());
	System.out.println(a.getOb());
	
	System.out.println(a);
	
	
	
	
	}

}
