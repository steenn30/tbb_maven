package com.tbb.dto;

public class UserDTO {

	
	private String username;
	
	private String password;
	
	private Boolean enabled;

	public UserDTO(String username, String password, Boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}
	
	public UserDTO() {
		super();
	}

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

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", password=" + password + ", enabled=" + enabled + "]";
	}
	
	
	
	
	
	
	
}
