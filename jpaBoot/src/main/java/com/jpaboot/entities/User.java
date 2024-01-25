package com.jpaboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userID;

	private String userName;
	private String city;
	private String emailID;
	
	public User(int userID, String userName, String city, String emailID) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.city = city;
		this.emailID = emailID;
	}
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}



	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", city=" + city + ", emailID=" + emailID + "]";
	}
	
	
	
}
