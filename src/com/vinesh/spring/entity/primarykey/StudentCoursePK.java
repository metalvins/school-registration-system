package com.vinesh.spring.entity.primarykey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentCoursePK implements Serializable{
	
	@Column(name="student_id")
	private int studentID; 
	
	@Column(name="course_name")
	private String course_name;
	
	public StudentCoursePK() {
		
	}

	public StudentCoursePK(int studentID, String course_name) {
		this.studentID = studentID;
		this.course_name = course_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course_name == null) ? 0 : course_name.hashCode());
		result = prime * result + studentID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof StudentCoursePK))
			return false;
		StudentCoursePK other = (StudentCoursePK) obj;
		if (course_name == null) {
			if (other.course_name != null)
				return false;
		} else if (!course_name.equals(other.course_name))
			return false;
		if (studentID != other.studentID)
			return false;
		return true;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
}
