package com.vinesh.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vinesh.spring.entity.Course;

@Repository
public class CourseDAOImpl implements CourseDAO {
	
	@Autowired
	private SessionFactory sf;

	@Override
	public List<Course> getCourses() {
		Session s = sf.getCurrentSession();
		List<Course> courses = s.createQuery("from Course", Course.class).getResultList();
		return courses;
	}

	@Override
	public Course getCourse(String courseName) {
		Session s = sf.getCurrentSession();
		
		Course c = s.get(Course.class, courseName);
		
		return c;
	}

	@Override
	public Course addCourse(Course c) {
		Session s = sf.getCurrentSession();
		
		s.save(c);
		
		return c;
	}

	@Override
	public Course updateCourse(Course c) {
		Session s = sf.getCurrentSession();
		
		s.createQuery("update Course set teacher = '" + c.getTeacher() + 
					  "', days = '" + c.getDays() + "', time = '" + c.getTime() +
					  "' where courseName = '" + c.getCourseName() + "'").executeUpdate();
		return c;
	}

	@Override
	public String deleteCourse(String courseName) {
		Session s = sf.getCurrentSession();
		s.createQuery("delete from Course where courseName = '" + courseName +"'");
		return courseName;
	}
}
