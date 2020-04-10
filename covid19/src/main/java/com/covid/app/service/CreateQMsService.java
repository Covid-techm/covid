package com.covid.app.service;

import org.springframework.http.ResponseEntity;

import com.covid.app.model.CreateQMs;
import com.covid.app.shared.SuccessResponse;

public interface CreateQMsService {
	
	public ResponseEntity<SuccessResponse> createQMs(CreateQMs createQMs);

}
