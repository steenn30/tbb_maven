package com.tbb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="ashtrays")
public class Ashtray {
	
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ashtray_id;
	
	@Column
	private String ashtray_name;
	

	public Ashtray(Integer ashtray_id, String ashtray_name) {
		super();
		this.ashtray_id = ashtray_id;
		this.ashtray_name = ashtray_name;
	}

	public Ashtray() {
		super();
	
	}
	public Integer getAshtray_id() {
		return ashtray_id;
	}

	public void setAshtray_id(Integer ashtray_id) {
		this.ashtray_id = ashtray_id;
	}

	public String getAshtray_name() {
		return ashtray_name;
	}

	public void setAshtray_name(String ashtray_name) {
		this.ashtray_name = ashtray_name;
	}

	@Override
	public String toString() {
		return "Ashtray [ashtray_id=" + ashtray_id + ", ashtray_name=" + ashtray_name + "]";
	}
	
	
	
	
	

}
