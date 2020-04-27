package com.covid.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.EndUser;
import com.covid.app.model.Monitor;
import com.covid.app.shared.SuccessResponse;

@Service
public interface EndUserService {
	
	public List<Monitor> assignMonitorEndUser(Monitor monitor, Long pinCode);
	
	public ResponseEntity<SuccessResponse> addEndUser(EndUser endUser);
	
	public Iterable<EndUser> listEndUsers(EndUser endUser);
	
	public Optional<EndUser> patientDetails(EndUser endUser, Long id);
	
	public long getTotalCases();

}
