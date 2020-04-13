package com.covid.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "monitor")
public class ViewMonitorsDetails {

	@Id
	@JsonProperty(value="MId")
	@Column(name = "mid")
	private Long mid;
	
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
	
	public ViewMonitorsDetails() {}

	

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
	

	
	
	public Long getMid() {
		return mid;
	}



	public void setMid(Long mid) {
		this.mid = mid;
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



	@Override
	public String toString() {
		return "ViewMonitorsDetails [mid=" + mid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", contactnumber=" + contactnumber + ", emailid=" + emailid + ", zone=" + zone + ", houseno="
				+ houseno + ", streetname=" + streetname + ", area=" + area + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}



	
}
