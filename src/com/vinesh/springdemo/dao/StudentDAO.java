package com.vinesh.springdemo.dao;

import java.util.List;

import com.vinesh.springdemo.entity.Student;

public interface StudentDAO {
	
	public List<Student> getStudents();
	
	public Student getStudent(int id);
	
}
