package com.vinesh.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vinesh.spring.entity.StudentCourse;

@Repository
public class StudentCourseDAOImpl implements StudentCourseDAO {

	@Autowired SessionFactory sf;
	@Override
	public StudentCourse registerStudent(StudentCourse sc) {
		Session s = sf.getCurrentSession();
		s.save(sc);
		return sc;
	}

}
