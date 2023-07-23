package com.spring.mvc.intercepter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterCeptorController 
{
	@RequestMapping("/search")
	public String search()
	{
		return "search";
	}
	
	@RequestMapping("/search-data")
	public String getSearchData(@RequestParam("name") String name, Model model)
	{
		System.out.println("In Contoller...");
		System.out.println("Name : " + name);
		model.addAttribute("name", name);
		
		return "search_result";
	}
}
