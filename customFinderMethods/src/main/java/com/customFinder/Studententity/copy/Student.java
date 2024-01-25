package com.customFinder.Studententity.copy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String student_Name;
	private String school;
	private String city;
	
	public Student(int id, String student_Name, String school, String city) {
		super();
		this.id = id;
		this.student_Name = student_Name;
		this.school = school;
		this.city = city;
	}

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStudent_Name() {
		return student_Name;
	}


	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", student_Name=" + student_Name + ", school=" + school + ", city=" + city + "]";
	}


	
	
}
