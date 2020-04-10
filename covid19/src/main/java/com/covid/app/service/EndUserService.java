package com.covid.app.service;

import org.springframework.http.ResponseEntity;

import com.covid.app.model.EndUser;

public interface EndUserService {
	
	public ResponseEntity<?> endUserDetails(EndUser endUser, String quarantinetype, Long qid);

}
