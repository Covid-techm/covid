package com.covid.app.model;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "monitor")
public class monitor {

	@Id
	Long id;

	String firstName;

	String lastName;

	Long contactNumber;

	String emailId;

	String designation;

	String department;

	String zone;

	Long houseno;

	String streetName;

	String area;

	String city;

	String state;

	Long pincode;
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public Long getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getZone() {
		return zone;
	}


	public void setZone(String zone) {
		this.zone = zone;
	}


	public Long getHouseno() {
		return houseno;
	}


	public void setHouseno(Long houseno) {
		this.houseno = houseno;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Long getPincode() {
		return pincode;
	}


	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "monitor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + ", designation=" + designation + ", department=" + department
				+ ", zone=" + zone + ", houseno=" + houseno + ", streetName=" + streetName + ", area=" + area
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
