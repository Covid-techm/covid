package com.covid.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.CreateMonitors;
import com.covid.app.repository.CreateMonitorsRepository;
import com.covid.app.shared.SuccessResponse;

@Service
public class CreateMonitorsServiceImpl implements CreateMonitorsService{
	
	@Autowired
	private CreateMonitorsRepository createMonitorsRepository;
	
	public ResponseEntity<SuccessResponse> createMonitors(CreateMonitors createMonitors){
		
		createMonitorsRepository.save(createMonitors);
		
		SuccessResponse success = new SuccessResponse();
		success.setSuccessCode(HttpStatus.OK.value());
		success.setMessage("Profile has been created successfully");
		
		return new ResponseEntity<SuccessResponse>(success, HttpStatus.OK);
		
	}

}
