package com.vinesh.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
	@Override
	public List<StudentCourse> getStudentIDs(String courseName) {
		Session s = sf.getCurrentSession();
		
		Query<StudentCourse> q = s.createQuery("from StudentCourse where pk.course_name='"
									  + courseName + "'", StudentCourse.class);
		
		return q.getResultList();
	}
	@Override
	public List<StudentCourse> getCourseNames(int id) {
		Session s = sf.getCurrentSession();
		
		Query<StudentCourse> q = s.createQuery("from StudentCourse where pk.studentID='"
									  + id + "'", StudentCourse.class);
		
		return q.getResultList();
	}
	@Override
	public StudentCourse dropStudent(StudentCourse sc) {
		Session s = sf.getCurrentSession();
		s.delete(sc);
		return sc;
	}

}
