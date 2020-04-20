package com.covid.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.CreateQMs;
import com.covid.app.repository.CreateQMsRepository;
import com.covid.app.shared.SuccessResponse;

@Service
public class CreateQMsServiceImpl implements CreateQMsService{
	
	@Autowired
	private CreateQMsRepository createQMsRepository;
	
	public ResponseEntity<SuccessResponse> createQMs(CreateQMs createQMs){
		
		createQMsRepository.save(createQMs);
		
		SuccessResponse success = new SuccessResponse();
		success.setSuccessCode(HttpStatus.OK.value());
		success.setMessage("Profile has been created successfully");
		
		return new ResponseEntity<SuccessResponse>(success, HttpStatus.OK);
		
	}

}
