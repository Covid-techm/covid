package com.covid.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@IdClass(ListMonitorsId.class)
@Table(name = "monitors")
public class ListMonitors implements Serializable{
	
	
	@Id
	@JsonProperty(value="MId")
	@JoinColumn(name = "mid")
	private Long mid;
	
	@JsonProperty(value="First Name")
	@Column(name = "firstname")
	private String firstname;
	
	@JsonProperty(value="Last Name")
	@Column(name = "lastname")
	private String lastname;
	
	@JsonProperty(value="Phone Number")
	@Column(name = "phone")
	private Long phone;
	
	@JsonProperty(value="Email Id")
	@Column(name = "email")
	private String email;
	
	@JsonProperty(value="Zone")
	@Column(name = "zone")
	private String zone;
	
	@JsonProperty(value="Pincode")
	@Column(name = "pincode")
	private Long pincode;
	

//	@ManyToOne(targetEntity=HealthStatus.class,fetch=FetchType.LAZY)
//	//	//@JoinColumn(name="imei_id") 
//	private List<HealthStatus> healthStatus;
	
	public ListMonitors() {}

	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
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

	
	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
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

	

	@Override
	public String toString() {
		return "ListMonitors [mid=" + mid + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone
				+ ", email=" + email + ", zone=" + zone + ", pincode=" + pincode +  "]";
	}


	
	
}
