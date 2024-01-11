package com.tbb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="user_p")
public class User {

	@Id
	@Column
	private String username;
	
	@Column
	private String password;
	
//	@Column
//	private Boolean enabled;

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

//	public Boolean getEnabled() {
//		return enabled;
//	}
//
//	public void setEnabled(Boolean enabled) {
//		this.enabled = enabled;
//	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

	public User(String username, String password, Boolean enabled) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public User() {
		super();
		
	}
	
	
	
	
}
