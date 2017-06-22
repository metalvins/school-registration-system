package com.vinesh.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vinesh.springdemo.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sf;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		
		// Get current Session
		Session s = sf.getCurrentSession();
		
		// Create query
		Query<Student> q = s.createQuery("from Student", Student.class);
		
		// Get list of students
		List<Student> students = q.getResultList();
		
		//return the list
		return students;
	}

	@Override
	@Transactional
	public Student getStudent(int id) {
		// Get current Session
		Session s = sf.getCurrentSession();
		
		//Get Student by ID
		Student student = (Student) s.get(Student.class, id);
		return student;
	}

	@Override
	@Transactional
	public Student addStudent(Student s) {
		
		Session session = sf.getCurrentSession();
		
		session.save(s);
		
		return s;
	}

	@Override
	@Transactional
	public Student updateStudent(Student s) {
		
		Session session = sf.getCurrentSession();
		
		session.createQuery("update Student set firstName='" + s.getFirstName() +
							"', lastName='" + s.getLastName() + "', email='" + s.getEmail() + "'" +
							" where id='" + s.getId() + "'").executeUpdate();
		
		return s;
	}

	@Override
	@Transactional
	public int deleteStudent(int id) {
		
		Session session = sf.getCurrentSession();
		
		session.createQuery("delete from Student where id = '" + id + "'").executeUpdate();
		
		return id;
		
	}

}
