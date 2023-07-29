package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
	/*
	 * without creating view resolver
	 * output : home
	 
	@GetMapping("/home")
	@ResponseBody
    public String getHome()
    {
    	return "home";
    }
    */
	
	@GetMapping("/home")
    public String getHome()
    {       	
		// return "/WEB-INF/views/home.jsp"; without view resolver	
    	return "home";
    }
	
}
