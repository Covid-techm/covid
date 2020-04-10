package com.covid.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "qurantinemanagers")
public class ListQMs {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@JsonProperty(value="Id")
//	@Column(name = "id")
//	private Long id;
	
	@Id
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
	
	@JsonProperty(value="Zone")
	@Column(name = "zone")
	private String zone;
	
	public ListQMs() {}


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


	@Override
	public String toString() {
		return "ListQMs [qid=" + qid + ", firstname=" + firstname + ", lastname=" + lastname + ", contactnumber="
				+ contactnumber + ", emailid=" + emailid + ", zone=" + zone + "]";
	}


}
