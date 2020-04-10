package com.covid.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "monitors")
public class CreateMonitors {
	

	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	
	


	public CreateMonitors(Long mid, String firstname, String lastname, Long contactnumber, String emailid,
			String designation, String department, String zone, Long houseno, String streetname, String area,
			String city, String state, Long pincode) {
		super();
		this.mid = mid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contactnumber = contactnumber;
		this.emailid = emailid;
		this.designation = designation;
		this.department = department;
		this.zone = zone;
		this.houseno = houseno;
		this.streetname = streetname;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public CreateMonitors() {}

	

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
		return "CreateMonitors [mid=" + mid + ", firstname=" + firstname + ", lastname=" + lastname + ", contactnumber="
				+ contactnumber + ", emailid=" + emailid + ", designation=" + designation + ", department=" + department
				+ ", zone=" + zone + ", houseno=" + houseno + ", streetname=" + streetname + ", area=" + area
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}


}

