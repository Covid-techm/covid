package com.covid.app.model;

import javax.persistence.Id;

public class QMDashBoardModel {

	@Id	
	private Long id;
	private String firstname;
	private String lastname;
	private String mobilenumber;
	private String email;
	private String zone;
	private int pincode;
	private Long quarentineDays;
	private String symptoms;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Long getQuarentineDays() {
		return quarentineDays;
	}

	public void setQuarentineDays(Long quarentineDays) {
		this.quarentineDays = quarentineDays;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

}
