//Q1.Using Hibernate Save Student Entity in Database.
package com.project.hibernetDemo;
//importing javax.persistence classes
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	//declaring attributes of student
	@Id
	private int sid;
	private String name;
	private String grade;
	private String email;
	
	//generating constructor from superclasses
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//generating constructor using fields
	public Student(int sid, String name, String grade, String email) {
		super();
		this.sid = sid;
		this.name = name;
		this.grade = grade;
		this.email = email;
	}
	//generating getter and setter methods 
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
