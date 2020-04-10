package com.covid.app.model;

import java.io.Serializable;


public class HealthStatusId implements Serializable{
	
	private Long mid;
	
	
	public HealthStatusId() {}

	

	public HealthStatusId(Long mid) {
		super();
		this.mid = mid;
	}



	public Long getMid() {
		return mid;
	}


	public void setMid(Long mid) {
		this.mid = mid;
	}
	
	

	

}
