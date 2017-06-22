package com.vinesh.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinesh.springdemo.dao.StudentDAO;
import com.vinesh.springdemo.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	//Inject the DAO
	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping("/list")
	public String listStudents(Model m) {
		
		List<Student> students = studentDAO.getStudents();
		
		m.addAttribute("students", students);
		
		return "list-students";
	}
}
