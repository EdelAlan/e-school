package com.alan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alan.mapper.StudentMapper;

@Controller
public class StudentController {
	
	private StudentMapper studentMapper;
	
	public StudentController(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students", studentMapper.getAllStudents());
		return "index";
	}
	
	@GetMapping("/create-student")
	public String studentCreationForm() {
		return "create-form";
	}
	
	@GetMapping("students/{id}")
	public String getStudent(@PathVariable("id") int id, Model model) {
		model.addAttribute("student", studentMapper.getStudent(id));
		return "student";
	}
}
