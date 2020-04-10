package com.covid.app.service;

import org.springframework.http.ResponseEntity;

import com.covid.app.model.CreateMonitors;
import com.covid.app.shared.SuccessResponse;

public interface CreateMonitorsService{

	public ResponseEntity<SuccessResponse> createMonitors(CreateMonitors createMonitors);
}
