package com.vinesh.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.vinesh.springdemo.entity.primarykey.StudentCoursePK;

@Entity
@Table(name="studentCourses")
public class StudentCourses {
	
	@EmbeddedId
	private StudentCoursePK pk;
	
	@Column(name="registered_date")
	private String regDate;

	public StudentCourses() {
	}

	public StudentCoursePK getPk() {
		return pk;
	}

	public void setPk(StudentCoursePK pk) {
		this.pk = pk;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "StudentCourses [pk=" + pk + ", regDate=" + regDate + "]";
	}
	
}
