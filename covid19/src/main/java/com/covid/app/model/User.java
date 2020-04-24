package com.covid.app.model;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;

@Entity
public class User {

	private String userName, password,role;

	public String getUserName() {
		return userName;
	}
	public void setUsername(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}	
}