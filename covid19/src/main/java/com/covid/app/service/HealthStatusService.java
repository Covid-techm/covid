package com.covid.app.service;

import org.springframework.http.ResponseEntity;

import com.covid.app.model.HealthStatus;
import com.covid.app.model.ListMonitors;

public interface HealthStatusService {
	
	public ResponseEntity<?> assignMonitor(ListMonitors listMonitors, Long pincode);
	
	public ResponseEntity<?> saveStatus(HealthStatus healthStatus);

}
