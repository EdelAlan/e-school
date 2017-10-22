package com.alan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alan.mapper.StudentMapper;
import com.alan.model.Student;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@PostMapping(value="/students")
	public void addStudent(@RequestParam("fullName") String fullName, @RequestParam("email") String email) {
		studentMapper.addStudent(new Student(fullName, email));
	}
	
	@DeleteMapping(value="/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentMapper.deleteStudent(id);
	}
	
}
