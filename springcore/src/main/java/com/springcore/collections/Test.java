package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      This code is for Emp class
      
	  ApplicationContext  context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");	
      Emp emp = (Emp) context.getBean("emp");
      System.out.println(emp);
      System.out.println("Name    :"+ emp.getName());
      System.out.println("Phones  :"+ emp.getPhones());
      System.out.println("Address :"+ emp.getAddresses());
      System.out.println("Cources :"+ emp.getCources());
      System.out.println("databaseConfig :"+ emp.getDatabaseConfig());

	}

}
