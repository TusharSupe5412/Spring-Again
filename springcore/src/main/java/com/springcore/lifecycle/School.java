package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");

		context.registerShutdownHook();
		
		Example example = (Example) context.getBean("example");
		System.out.println("Subject : "+example.getSubject());
	}

}
