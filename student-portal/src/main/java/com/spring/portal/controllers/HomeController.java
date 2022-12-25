package com.spring.portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/getCurrentSemSubjects")
	public String getCurrentSemSubjects(String sapid) {
		
		System.out.println("I am starting my project");
		
		return sapid;
		
	}

}
