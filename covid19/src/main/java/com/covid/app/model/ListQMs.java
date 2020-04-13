package com.covid.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "qurantinemangeer")
public class ListQMs {

	@Id
	@JsonProperty(value = "QmId")
	@Column(name = "qmid")
	private Long qmid;

	@JsonProperty(value = "First Name")
	@Column(name = "firstname")
	private String firstname;

	@JsonProperty(value = "Last Name")
	@Column(name = "lastname")
	private String lastname;

	@JsonProperty(value = "Contact Number")
	@Column(name = "phone")
	private Long phone;

	@JsonProperty(value = "Email Id")
	@Column(name = "email")
	private String email;

	@JsonProperty(value = "Zone")
	@Column(name = "zone")
	private String zone;

	public ListQMs() {
	}

	public Long getQmid() {
		return qmid;
	}

	public void setQmid(Long qmid) {
		this.qmid = qmid;
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

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
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

	@Override
	public String toString() {
		return "ListQMs [qmid=" + qmid + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone
				+ ", email=" + email + ", zone=" + zone + "]";
	}

}
