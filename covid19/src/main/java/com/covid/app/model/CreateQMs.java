package com.covid.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "qurantinemanagers")
public class CreateQMs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty(value="QId")
	@Column(name = "qid")
	private Long qid;
	
	@JsonProperty(value="First Name")
	@Column(name = "firstname")
	private String firstname;
	
	@JsonProperty(value="Last Name")
	@Column(name = "lastname")
	private String lastname;
	
	@JsonProperty(value="Contact Number")
	@Column(name = "contactnumber")
	private Long contactnumber;
	
	@JsonProperty(value="Email Id")
	@Column(name = "emailid")
	private String emailid;
	
	@JsonProperty(value="Designation")
	@Column(name = "designation")
	private String designation;
	
	@JsonProperty(value="Department")
	@Column(name = "department")
	private String department;
	
	@JsonProperty(value="Zone")
	@Column(name = "zone")
	private String zone;
	
	@JsonProperty(value="House No")
	@Column(name = "houseno")
	private Long houseno;
	
	@JsonProperty(value="Street Name")
	@Column(name = "streetname")
	private String streetname;
	
	@JsonProperty(value="Area")
	@Column(name = "area")
	private String area;
	
	@JsonProperty(value="City")
	@Column(name = "city")
	private String city;
	
	@JsonProperty(value="State")
	@Column(name = "state")
	private String state;
	
	@JsonProperty(value="Pin Code")
	@Column(name = "pincode")
	private Long pincode;
	
	public CreateQMs() {}

	

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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	

	
	public Long getQid() {
		return qid;
	}



	public void setQid(Long qid) {
		this.qid = qid;
	}



	public Long getHouseno() {
		return houseno;
	}



	public void setHouseno(Long houseno) {
		this.houseno = houseno;
	}



	public String getStreetname() {
		return streetname;
	}



	public void setStreetname(String streetname) {
		this.streetname = streetname;
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



	@Override
	public String toString() {
		return "CreateQMs [qid=" + qid + ", firstname=" + firstname + ", lastname=" + lastname + ", contactnumber="
				+ contactnumber + ", emailid=" + emailid + ", designation=" + designation + ", department=" + department
				+ ", zone=" + zone + ", houseno=" + houseno + ", streetname=" + streetname + ", area=" + area
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}


}
