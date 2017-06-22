package com.vinesh.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinesh.springdemo.dao.StudentDAO;
import com.vinesh.springdemo.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	//Inject the DAO
	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping("/welcome")
	public String getWelcomePage() {
		return "welcome";
	}
	
	@RequestMapping("/listALL")
	public String listStudents(Model m) {
		
		List<Student> students = studentDAO.getStudents();
		
		m.addAttribute("students", students);
		
		return "list-students";
	}
	
	@RequestMapping("/findStudent")
	public String listStudent(Model m) {
		m.addAttribute("student", new Student());
		return "find-student";
	}
	
	@RequestMapping("/getStudent")
	public String getStudent(@ModelAttribute("student") Student s, Model m) {
		System.out.println("ID: " + s.getId());
		
		m.addAttribute("student", studentDAO.getStudent(s.getId()));
		return "show-student";
	}
}
