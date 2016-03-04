package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/secure/admin") 
	public String admin(){
		return "admin";
	}
}
