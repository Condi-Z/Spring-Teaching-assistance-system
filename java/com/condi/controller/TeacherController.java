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
import com.condi.service.TeacherService;

@Controller
@RequestMapping("/Condiapp")
public class TeacherController {
	
//	@Autowired
//	private StudentDAO studentdao;
	
	@Autowired
	private TeacherService teacherservice;
	
	//@RequestMapping("/list")
	@GetMapping("/Teacher")
	private String ListTeachers(Model theModel) {
		List<Teacher> teacherlist = teacherservice.getTeachers();
		theModel.addAttribute("teacherlist", teacherlist);
		return "teacher";
	}
	
	@GetMapping("/Student")
	private String ListStudents(Model theModel) {
		List<Teacher> teacherlist = teacherservice.getTeachers();
		theModel.addAttribute("teacherlist", teacherlist);
		return "student";
	}
	
	@GetMapping("/addTeacher")
	public String AddTeacherForm(Model model) {
		Teacher st = new Teacher();
		model.addAttribute("teacher",st);
		return "save";
	}
	
	@PostMapping("/addTeacherProcess")
	public String ProcessAddTeacherForm(@ModelAttribute("teacher") Teacher theteacher) {
		teacherservice.SaveTeacher(theteacher);
		return "redirect:/Condiapp/Teacher";
	}
	
	@GetMapping("/updateTeacher")
	public String UpdateTeacherForm(@RequestParam("teacherid")int teacherid, Model model) {
		Teacher st = teacherservice.getTeacher(teacherid);
		model.addAttribute("teacher",st);
		return "save";
	}
	
	@GetMapping("/updateStudent")
	public String showUpdateStudentForm(@RequestParam("teacherid")int teacherid, Model model) {
		Teacher st = teacherservice.getTeacher(teacherid);
		model.addAttribute("student",st);
		return "save_student";
	}
	
	@PostMapping("/addStudentProcess")
	public String ProcessAddStudentForm(@ModelAttribute("student") Teacher theteacher) {
		teacherservice.SaveStudent(theteacher);
		return "redirect:/Condiapp/Student";
	}
	
	@GetMapping("/deleteTeacher")
	public String deleteTeacher(@RequestParam("teacherid")int teacherid) {
		teacherservice.deleteTeacher(teacherid);
		return "redirect:/Condiapp/Teacher";
	}

	@GetMapping("/sb")
	private String sb(Model theModel) {
		List<Teacher> teacherlist = teacherservice.getTeachers();
		theModel.addAttribute("teacherlist", teacherlist);
		return "sb_student";
	}
}
