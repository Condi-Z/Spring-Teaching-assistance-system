package com.condi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.condi.entity.Teacher;
import com.condi.entity.Users;
import com.condi.service.UsersService;

@Controller
@RequestMapping("/Condiapp")
public class UsersController {
	
	@Autowired
	private UsersService usersservice;
	
//	@GetMapping("/")
//	private String ListTeachers(Model theModel) {
//		List<Users> userslist = usersservice.getUsers();
//		theModel.addAttribute("userslist", userslist);
//		return "main_menu";
//	}
	
//	@GetMapping("/Passw")
//	public String UpdatePasswordForm(@RequestParam("usersid")int usersid, Model model) {
//		Users st = usersservice.getUser(usersid);
//		model.addAttribute("users",st);
//		return "password";
//	}
	
	@RequestMapping("/Passw")
	public String UpdatePasswordForm() {
		return "password";
	}
}
