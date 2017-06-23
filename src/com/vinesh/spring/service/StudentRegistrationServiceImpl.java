package com.vinesh.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vinesh.spring.dao.CourseDAO;
import com.vinesh.spring.dao.StudentCourseDAO;
import com.vinesh.spring.dao.StudentDAO;
import com.vinesh.spring.entity.Course;
import com.vinesh.spring.entity.Student;
import com.vinesh.spring.entity.StudentCourse;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Autowired
	private CourseDAO courseDAO;
	
	@Autowired StudentCourseDAO studentCourseDAO;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public Student getStudent(int id) {
		return studentDAO.getStudent(id);
	}

	@Override
	@Transactional
	public Student addStudent(Student s) {
		return studentDAO.addStudent(s);
	}

	@Override
	@Transactional
	public int deleteStudent(int id) {
		return studentDAO.deleteStudent(id);
	}

	@Override
	@Transactional
	public Student updateStudent(Student s) {
		return studentDAO.updateStudent(s);
	}

	@Override
	@Transactional
	public List<Course> getCourses() {
		return courseDAO.getCourses();
	}

	@Override
	@Transactional
	public Course getCourse(String courseName) {
		return courseDAO.getCourse(courseName);
	}

	@Override
	@Transactional
	public Course addCourse(Course c) {
		return courseDAO.addCourse(c);
	}

	@Override
	@Transactional
	public Course updateCourse(Course c) {
		return courseDAO.updateCourse(c);
	}

	@Override
	@Transactional
	public String deleteCourse(String courseName) {
		return courseDAO.deleteCourse(courseName);
	}

	@Override
	@Transactional
	public StudentCourse registerStudent(StudentCourse sc) {
		return studentCourseDAO.registerStudent(sc);
	}

}
