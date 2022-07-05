package com.condi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.condi.entity.Log;
import com.condi.service.LogService;

@Controller
@RequestMapping("/Condiapp")
public class LogController {
	
	@Autowired
	private LogService logservice;
	
	@GetMapping("/Log")
	private String ListTeachers(Model theModel) {
		List<Log> loglist = logservice.getLogs();
		theModel.addAttribute("loglist", loglist);
		return "log";
	}
	
	@GetMapping("/addLog")
	public String AddLogForm(Model model) {
		Log st = new Log();
		model.addAttribute("logs",st);
		return null;
	}
	@PostMapping("/addLogs")
	public String ProcessAddTeacherForm(@ModelAttribute("logs") Log thelog) {
		logservice.SaveLogs(thelog);
		return null;
	}
}
