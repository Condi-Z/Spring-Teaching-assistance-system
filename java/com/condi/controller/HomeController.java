package com.condi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String ShowPage() {
		return "main_menu";
	}
	
	@GetMapping("/showMyLoginPage")
	public String myloginform() {
		return "loginform";
	}
	
	
}
