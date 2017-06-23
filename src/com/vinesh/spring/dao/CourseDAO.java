package com.vinesh.spring.dao;

import java.util.List;

import com.vinesh.spring.entity.Course;

public interface CourseDAO {
	public List<Course> getCourses();
	
	public Course getCourse(String courseName);
	
	public Course addCourse(Course c);
	
	public Course updateCourse(Course c);
	
	public String deleteCourse(String courseName);

}
