package com.springcore.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springjdbc/config.xml");
		
		StudentDaoImpl studentDaoImpl = context.getBean("studntDaoImpl",StudentDaoImpl.class);
		
		Student student = new Student ();
		
		student.setId(111);
		student.setName("Kavya Supe");
		student.setCity("Kalyan");
		
		int result = studentDaoImpl.insert(student);
		
		System.out.println("No. of records inserted :"+ result);
		
	}

}
