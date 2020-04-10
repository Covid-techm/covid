package com.covid.app.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "enduser")
public class EndUser {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty(value="QId")
	@Column(name = "qid")
	private Long qid;
	
	@JsonProperty(value="First Name")
	@Column(name = "firstname")
	private String firstname;
	
	@JsonProperty(value="Last Name")
	@Column(name = "lastname")
	private String lastname;
	
//	@JsonProperty(value="DOB")
//	@Column(name = "dob")
//	private LocalDate dob;
	
	@JsonProperty(value="Pin Code")
	@Column(name = "pincode")
	private Long pincode;
	
	@JsonProperty(value="Email Id")
	@Column(name = "emailid")
	private String emailid;
	
	@JsonProperty(value="Mobile Number")
	@Column(name = "mobilenumber")
	private Long mobilenumber;
	
	@JsonProperty(value="Quarantine Type")
	@Column(name = "quarantinetype")
	private String quarantinetype;
	
//	@JsonProperty(value="Quarantine Startdate")
//	@Column(name = "quarantinestartdate")
//	private LocalDate quarantinestartdate;
	
	@JsonProperty(value="Symptoms")
	@Column(name = "symptoms")
	private String symptoms;
	
	
	public EndUser() {}


	public Long getQid() {
		return qid;
	}


	public void setQid(Long qid) {
		this.qid = qid;
	}


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


//	public LocalDate getDob() {
//		return dob;
//	}
//
//
//	public void setDob(LocalDate dob) {
//		this.dob = dob;
//	}


	public Long getPincode() {
		return pincode;
	}


	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public Long getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public String getQuarantinetype() {
		return quarantinetype;
	}


	public void setQuarantinetype(String quarantinetype) {
		this.quarantinetype = quarantinetype;
	}


//	public LocalDate getQuarantinestartdate() {
//		return quarantinestartdate;
//	}
//
//
//	public void setQuarantinestartdate(LocalDate quarantinestartdate) {
//		this.quarantinestartdate = quarantinestartdate;
//	}


	public String getSymptoms() {
		return symptoms;
	}


	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}


	@Override
	public String toString() {
		return "EndUser [qid=" + qid + ", firstname=" + firstname + ", lastname=" + lastname + ", pincode=" + pincode
				+ ", emailid=" + emailid + ", mobilenumber=" + mobilenumber + ", quarantinetype=" + quarantinetype
				+ ", symptoms=" + symptoms + "]";
	}


	
	

}
