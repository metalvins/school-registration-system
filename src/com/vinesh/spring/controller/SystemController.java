package com.vinesh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinesh.spring.entity.Course;
import com.vinesh.spring.entity.Student;
import com.vinesh.spring.entity.StudentCourse;
import com.vinesh.spring.entity.primarykey.StudentCoursePK;
import com.vinesh.spring.service.StudentRegistrationService;

@Controller
@RequestMapping("/student")
public class SystemController {
	
	@Autowired
	private StudentRegistrationService srs;
	
	@RequestMapping("/welcome")
	public String getWelcomePage() {
		return "welcome";
	}
	
	@RequestMapping("/listAllStudents")
	public String listStudents(Model m) {
		
		List<Student> students = srs.getStudents();
		
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
		
		m.addAttribute("student", srs.getStudent(s.getId()));
		return "show-student";
	}
	
	@RequestMapping("/getAddStudent")
	public String getAddStudent(@ModelAttribute("student") Student s, Model m) {
		System.out.println("Adding Student ID: " + s.getId());
		
		m.addAttribute("student", srs.addStudent(s));
		return "show-student";
	}
	
	@RequestMapping("/getUpdateStudent")
	public String getUpdateStudent(@ModelAttribute("student") Student s, Model m) {
		System.out.println("Updating Student ID: " + s.getId());
		
		m.addAttribute("student", srs.updateStudent(s));
		return "show-student";
	}
	
	@RequestMapping("/getDeleteStudent")
	public String getDeleteStudent(@ModelAttribute("student") Student s, Model m) {
		System.out.println("Deleting Student ID: " + s.getId());
		
		m.addAttribute("studentID", srs.deleteStudent(s.getId()));
		return "show-student-delete";
	}
	@RequestMapping("/listAllCourses")
	public String listCourses(Model m) {
		
		List<Course> courses = srs.getCourses();
		
		m.addAttribute("courses", courses);
		
		return "list-courses";
	}
	
	@RequestMapping("/findCourse")
	public String listCourse(Model m) {
		m.addAttribute("course", new Course());
		return "find-course";
	}
	
	@RequestMapping("/addCourse")
	public String addCourse(Model m) {
		m.addAttribute("course", new Course());
		return "add-course";
	}
	
	@RequestMapping("/updateCourse")
	public String updateCourse(Model m) {
		m.addAttribute("course", new Course());
		return "update-course";
	}
	
	@RequestMapping("/deleteCourse")
	public String deleteCourse(Model m) {
		m.addAttribute("course", new Course());
		return "delete-course";
	}
	
	@RequestMapping("/getCourse")
	public String getCourse(@ModelAttribute("course") Course c, Model m) {
		System.out.println("Course: " + c.getCourseName());
		
		m.addAttribute("course", srs.getCourse(c.getCourseName()));
		return "show-course";
	}
	
	@RequestMapping("/getAddCourse")
	public String getAddCourse(@ModelAttribute("course") Course c, Model m) {
		System.out.println("Adding Course: " + c.getCourseName());
		
		m.addAttribute("course", srs.addCourse(c));
		return "show-course";
	}
	
	@RequestMapping("/getUpdateCourse")
	public String getUpdateCourse(@ModelAttribute("course") Course c, Model m) {
		System.out.println("Updating Course: " + c.getCourseName());
		
		m.addAttribute("course", srs.updateCourse(c));
		return "show-course";
	}
	
	@RequestMapping("/getDeleteCourse")
	public String getDeleteCourse(@ModelAttribute("course") Course c, Model m) {
		System.out.println("Deleting Course : " + c.getCourseName());
		
		m.addAttribute("courseName", srs.deleteCourse(c.getCourseName()));
		return "show-course-delete";
	}
	
	@RequestMapping("/registerStudentForCourse")
	public String registerStudentforCourse(Model m) {
		
		m.addAttribute("studentCourse", new StudentCourse(new StudentCoursePK()));
		
		return "register-student-for-course";
	}
	
	@RequestMapping("/registerCourse")
	public String registerCourse(@ModelAttribute("studentCourse") StudentCourse sc, Model m) {
		System.out.println("Registering student ID:" + sc.getPk().getStudentID() +
						   " for course:" + sc.getPk().getCourse_name());
		m.addAttribute("studentCourse", srs.registerStudent(sc));
		return "show-registration";
	}
	
	@RequestMapping("/showStudentsForCourse")
	public String viewStudentsForCourse(Model m) {
		
		m.addAttribute("course", new Course());
		
		return "show-students-for-course";
	}
	
	@RequestMapping("/studentsForCourse")
	public String studentsForCourse(@ModelAttribute("course") Course c, Model m) {
		
		List<Student> students = srs.getStudentsForCourse(c.getCourseName());
		
		m.addAttribute("students", students);
		
		return "list-students";
		
	}
	
	@RequestMapping("/showCoursesForStudent")
	public String viewCoursesForStudent(Model m) {
		
		m.addAttribute("student", new Student());
		
		return "show-courses-for-student";
	}
	
	@RequestMapping("/coursesForStudent")
	public String coursesForStudent(@ModelAttribute("student") Student s, Model m) {
		
		List<Course> courses = srs.getCoursesForStudent(s.getId());
		
		m.addAttribute("courses", courses);
		
		return "list-courses";
		
	}
}
