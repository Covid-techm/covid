package com.covid.app.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@IdClass(HealthStatusId.class)
@Table(name = "healthstatusupdate")
@SecondaryTable(name = "monitors")
public class HealthStatus implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty(value="Id")
	@Column(name = "id")
	private Long id;
	
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
	
	@JsonProperty(value="ALternative Contact Number")
	@Column(name = "altcontactnumber")
	private Long altcontactnumber;
	
	@JsonProperty(value="Govt Id Type")
	@Column(name = "govtidtype")
	private String govtidtype;
	
	@JsonProperty(value="Govt Id Number")
	@Column(name = "govtidnumber")
	private String govtidnumber;
	
	@JsonProperty(value="Email Id")
	@Column(name = "emailid")
	private String emailid;
	
	@JsonProperty(value="DOB")
	@Column(name = "dob")
	private LocalDate dob;
	
	@JsonProperty(value="Fever")
	@Column(name = "fever")
	private String fever;
	
	@JsonProperty(value="Cough")
	@Column(name = "cough")
	private String cough;
	
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
	
	public HealthStatus() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}

	public Long getAltcontactnumber() {
		return altcontactnumber;
	}

	public void setAltcontactnumber(Long altcontactnumber) {
		this.altcontactnumber = altcontactnumber;
	}

	public String getGovtidtype() {
		return govtidtype;
	}

	public void setGovtidtype(String govtidtype) {
		this.govtidtype = govtidtype;
	}

	public String getGovtidnumber() {
		return govtidnumber;
	}

	public void setGovtidnumber(String govtidnumber) {
		this.govtidnumber = govtidnumber;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getFever() {
		return fever;
	}

	public void setFever(String fever) {
		this.fever = fever;
	}

	public String getCough() {
		return cough;
	}

	public void setCough(String cough) {
		this.cough = cough;
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
		return "HealthStatus [id=" + id + ", mid=" + mid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", contactnumber=" + contactnumber + ", altcontactnumber=" + altcontactnumber + ", govtidtype="
				+ govtidtype + ", govtidnumber=" + govtidnumber + ", emailid=" + emailid + ", dob=" + dob + ", fever="
				+ fever + ", cough=" + cough + ", houseno=" + houseno + ", streetname=" + streetname + ", area=" + area
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

	
	

}
