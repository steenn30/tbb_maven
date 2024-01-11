package com.tbb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="authorities")
public class Authorities {
	
	@Id
	@Column
	private String username;
	
	@Column
	private String authority;

	public Authorities(String username, String authority) {
		super();
		this.username = username;
		this.authority = authority;
	}
	
	public Authorities() {
		super();
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	

}
