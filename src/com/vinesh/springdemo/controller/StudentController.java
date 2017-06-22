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
	
	@RequestMapping("/addStudent")
	public String addStudent(Model m) {
		m.addAttribute("student", new Student());
		return "add-student";
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(Model m) {
		m.addAttribute("student", new Student());
		return "update-student";
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent(Model m) {
		m.addAttribute("student", new Student());
		return "delete-student";
	}
	
	@RequestMapping("/getStudent")
	public String getStudent(@ModelAttribute("student") Student s, Model m) {
		System.out.println("ID: " + s.getId());
		
		m.addAttribute("student", studentDAO.getStudent(s.getId()));
		return "show-student";
	}
	
	@RequestMapping("/getAddStudent")
	public String getAddStudent(@ModelAttribute("student") Student s, Model m) {
		System.out.println("Adding Student ID: " + s.getId());
		
		m.addAttribute("student", studentDAO.addStudent(s));
		return "show-student";
	}
	
	@RequestMapping("/getUpdateStudent")
	public String getUpdateStudent(@ModelAttribute("student") Student s, Model m) {
		System.out.println("Updating Student ID: " + s.getId());
		
		m.addAttribute("student", studentDAO.updateStudent(s));
		return "show-student";
	}
	
	@RequestMapping("/getDeleteStudent")
	public String getDeleteStudent(@ModelAttribute("student") Student s, Model m) {
		System.out.println("Deleting Student ID: " + s.getId());
		
		m.addAttribute("studentID", studentDAO.deleteStudent(s.getId()));
		return "show-student-delete";
	}
}
