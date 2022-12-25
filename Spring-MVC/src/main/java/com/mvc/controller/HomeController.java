package com.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.beans.StudentBean;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		
		System.out.println("This is home url");
		model.addAttribute("name", "Tushar Supe");
		List<String> friends = new ArrayList<String>();
		friends.add("Pk");
		friends.add("Sam");
		friends.add("Vaibhav");
		
		model.addAttribute("frnd", friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help(StudentBean sb) {
		
		//Creating an Object of ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name", "Tushar Supe");
		modelAndView.addObject("RollNo", 12345);
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		sb.setId("1");
		sb.setName("Aruna Supe");
		sb.setPhones("8329308132");
		
		modelAndView.addObject("details", sb);
		
		//setting the view name
		modelAndView.setViewName("help");
		
//		List<String> phones = new ArrayList<>();
//		phones.set(0,"8329308132");
//		phones.set(1, "9594299340");
		
		
		return modelAndView;
	}
	
}
