package com.tbb.dto;

import javax.annotation.sql.DataSourceDefinition;


public class RegisterUserDTO {
	private String username;
	
	private String password;
	
	private String email;
	
	private String firstName;

	private String lastName;

//	public RegisterUserDTO(String username, String password, String email, String firstName, String lastName) {
//		super();
//		this.username = username;
//		this.password = password;
//		this.email = email;
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//	
//	public RegisterUserDTO() {
//		super();
//		
//	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

	public RegisterUserDTO(String username, String password, String email, String firstName, String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "RegisterUserDTO [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	

}
