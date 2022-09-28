package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/config.xml");

		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		// Insert data
		
		String sql = "insert into springjdbc.student (id,name,city) values(?,?,?)";
		
		//fire query
		
		int result = jdbcTemplate.update(sql,10,"Aruna","Ugalewadi");
		
		System.out.println("No of row inserted:" + result);
	}

}
