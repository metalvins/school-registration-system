package com.vinesh.springdemo.dao;

import java.util.List;

import com.vinesh.springdemo.entity.Student;

public interface StudentDAO {
	
	public List<Student> getStudents();
	
	public Student getStudent(int id);
	
	public Student addStudent(Student s);
	
	public Student updateStudent(Student s);
	
	public int deleteStudent(int id);

}
