package com.serverValidation.loginEntity;


import javax.validation.constraints.AssertTrue;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginEnt {
	
	@NotBlank(message = "UserName can not be empty !")
	@Size(min = 3, max = 15,message = "name should contain atleast 3 letters !")
	private String userName;
	
	@Email(regexp = "^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$", message = "Invalid Email")
	private String emailId;
	
	@NotBlank(message = "password must be entered")
	private String password;
	
	@AssertTrue(message="must be check")
	private boolean agreement;
	
	
	public LoginEnt(String userName, String emailID, String password) {
		super();
		this.userName = userName;
		this.emailId = emailID;
		this.password = password;
	}
	public LoginEnt() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public boolean isAgreement() {
		return agreement;
	}
	public void setAgreement(boolean agreement) {
		this.agreement = agreement;
	}
	@Override
	public String toString() {
		return "LoginEnt [userName=" + userName + ", emailId=" + emailId + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
