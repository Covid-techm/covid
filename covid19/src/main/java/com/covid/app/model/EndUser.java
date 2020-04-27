package com.covid.app.model;

import java.time.LocalDate;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "enduser")
public class EndUser {
	
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private Long contactNumber;
	private String emailId;
	private Long houseno;
	private String streetName;
	private String area;
	private String city;
	private String state;
	private Long pinCode;
	private String govtId;
	private String govtIdType;
	private LocalDate dob;
	private String quarantineStartDate;
	private String fever;
	private String cough;
	private String breathing;
	private String runnynose;
	private String temperature;
	private String fatigue;
	private String diarrhea;
	private String mFirstName;
	private String mLastName;
	private Long mContactNumber;
	private String zone;
	private String mEmailId;
	
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
	
	public Long getPinCode() {
		return pinCode;
	}
	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}
	public String getGovtId() {
		return govtId;
	}
	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}
	public String getGovtIdType() {
		return govtIdType;
	}
	public void setGovtIdType(String govtIdType) {
		this.govtIdType = govtIdType;
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
	public String getBreathing() {
		return breathing;
	}
	public void setBreathing(String breathing) {
		this.breathing = breathing;
	}
	public String getRunnynose() {
		return runnynose;
	}
	public void setRunnynose(String runnynose) {
		this.runnynose = runnynose;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getFatigue() {
		return fatigue;
	}
	public void setFatigue(String fatigue) {
		this.fatigue = fatigue;
	}
	public String getDiarrhea() {
		return diarrhea;
	}
	public void setDiarrhea(String diarrhea) {
		this.diarrhea = diarrhea;
	}
	public String getmFirstName() {
		return mFirstName;
	}
	public void setmFirstName(String mFirstName) {
		this.mFirstName = mFirstName;
	}
	public String getmLastName() {
		return mLastName;
	}
	public void setmLastName(String mLastName) {
		this.mLastName = mLastName;
	}
	public Long getmContactNumber() {
		return mContactNumber;
	}
	public void setmContactNumber(Long mContactNumber) {
		this.mContactNumber = mContactNumber;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getmEmailId() {
		return mEmailId;
	}
	public void setmEmailId(String mEmailId) {
		this.mEmailId = mEmailId;
	}
	
	
	public String getQuarantineStartDate() {
		return quarantineStartDate;
	}
	public void setQuarantineStartDate(String quarantineStartDate) {
		this.quarantineStartDate = quarantineStartDate;
	}
	@Override
	public String toString() {
		return "EndUser [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + ", houseno=" + houseno + ", streetName=" + streetName
				+ ", area=" + area + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", govtId="
				+ govtId + ", govtIdType=" + govtIdType + ", dob=" + dob + ", quarantineStartDate="
				+ quarantineStartDate + ", fever=" + fever + ", cough=" + cough + ", breathing=" + breathing
				+ ", runnynose=" + runnynose + ", temperature=" + temperature + ", fatigue=" + fatigue + ", diarrhea="
				+ diarrhea + ", mFirstName=" + mFirstName + ", mLastName=" + mLastName + ", mContactNumber="
				+ mContactNumber + ", zone=" + zone + ", mEmailId=" + mEmailId + "]";
	}
	

}
