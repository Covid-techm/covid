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
@Table(name = "monitor")
public class CreateMonitors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(value = "mid")
	@Column(name = "mid")
	private Long mid;

	@JsonProperty(value = "First Name")
	@Column(name = "firstname")
	private String firstname;

	@JsonProperty(value = "Last Name")
	@Column(name = "lastname")
	private String lastname;

	@JsonProperty(value = "phone")
	@Column(name = "phone")
	private String phone;

	@JsonProperty(value = "Email Id")
	@Column(name = "email")
	private String email;

	@JsonProperty(value = "Designation")
	@Column(name = "designation")
	private String designation;

	@JsonProperty(value = "Department")
	@Column(name = "department")
	private String department;

	@JsonProperty(value = "Zone")
	@Column(name = "zone")
	private String zone;
	
	@JsonProperty(value = "Id Card Type")
	@Column(name = "idcardtype")
	private String IdCardType;

	
	@JsonProperty(value = "House No")
	@Column(name = "hno")
	private Long houseno;

	@JsonProperty(value = "Street Name")
	@Column(name = "streetname")
	private String streetname;

	@JsonProperty(value = "Area")
	@Column(name = "area")
	private String area;

	@JsonProperty(value = "City")
	@Column(name = "city")
	private String city;

	@JsonProperty(value = "State")
	@Column(name = "state")
	private String state;

	@JsonProperty(value = "Pin Code")
	@Column(name = "pincode")
	private Long pincode;
	

	@JsonProperty(value = "Login Name")
	@Column(name = "loginname")
	private String loginname;
	


	public String getLoginName() {
		return loginname;
	}

	public void setLoginName(String loginname) {
		this.loginname = loginname;
	}
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getIdCardType() {
		return IdCardType;
	}

	public void setIdCardType(String idCardType) {
		IdCardType = idCardType;
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
		return "CreateMonitors [mid=" + mid + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone
				+ ", email=" + email + ", designation=" + designation + ", department=" + department + ", zone=" + zone
				+ ", IdCardType=" + IdCardType + ", houseno=" + houseno + ", streetname=" + streetname + ", area="
				+ area + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", loginName=" + loginname
				+ "]";
	}

}
