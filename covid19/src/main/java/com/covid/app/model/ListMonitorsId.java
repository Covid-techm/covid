package com.covid.app.model;

import java.io.Serializable;


public class ListMonitorsId implements Serializable{
	
	private Long mid;
	
	

	public ListMonitorsId(Long mid) {
		super();
		this.mid = mid;
	}


	public ListMonitorsId() {}


	public Long getMid() {
		return mid;
	}


	public void setMid(Long mid) {
		this.mid = mid;
	}

	

}
