package com.vinesh.spring.service;

import java.util.List;

import com.vinesh.spring.entity.Course;
import com.vinesh.spring.entity.Student;
import com.vinesh.spring.entity.StudentCourse;

public interface StudentRegistrationService {
	
	public List<Student> getStudents();

	public Student getStudent(int id);

	public Student addStudent(Student s);

	public int deleteStudent(int id);

	public Student updateStudent(Student s);

	public List<Course> getCourses();

	public Course getCourse(String courseName);

	public Course addCourse(Course c);

	public Course updateCourse(Course c);

	public String deleteCourse(String courseName);

	public StudentCourse registerStudent(StudentCourse sc);

	public List<Student> getStudentsForCourse(String courseName);

	public List<Course> getCoursesForStudent(int id);

	public StudentCourse dropStudent(StudentCourse sc);

}
