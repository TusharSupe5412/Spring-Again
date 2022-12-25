package com.springmvc.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name","Tushar Supe");
		
		List <String> friends = new ArrayList<String>();
		
		friends.add("Pk");
		friends.add("Sam");
		friends.add("Kishor");
		friends.add("Vaibhav");
		
		model.addAttribute("f", friends);
		
		
		return "home";
	}
	
	@RequestMapping("about")
	public String about() {
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		//Create model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//Setting the data
		modelAndView.addObject("name", "Tushar Supe");
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//Set the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
	
	
	
	
	
}
