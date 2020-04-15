package com.covid.app.service;

import org.springframework.http.ResponseEntity;

import com.covid.app.model.monitor;
import com.covid.app.shared.SuccessResponse;

public interface CreateMonitorsService{

	public ResponseEntity<SuccessResponse> saveMonitor(monitor createMonitors);
}
