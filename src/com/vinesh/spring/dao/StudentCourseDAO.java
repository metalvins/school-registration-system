package com.vinesh.spring.dao;

import java.util.List;

import com.vinesh.spring.entity.StudentCourse;

public interface StudentCourseDAO {
	
	public StudentCourse registerStudent(StudentCourse sc);

	public List<StudentCourse> getStudentIDs(String courseName);

	public List<StudentCourse> getCourseNames(int id);
}
