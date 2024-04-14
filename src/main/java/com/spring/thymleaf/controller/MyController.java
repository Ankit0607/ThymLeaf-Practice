package com.spring.thymleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/about")
	public String about() {
		System.out.println("Inside About Handler");
		return "about";
	}

	@GetMapping("/error")
	public String error() {
		System.out.println("Inside Error Handler");
		return "error";
	}
	
	@GetMapping("/condition")
	public String conditional(Model m) {
		System.out.println("Conditional statement executed");
		m.addAttribute("isActive", true);
		m.addAttribute("gender", "M");
		List<Integer> list = List.of(222, 333, 444, 1111);
		m.addAttribute("mylist", list);
		return "condition";
		
	}
}
