package com.covid.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.app.model.EndUser;
import com.covid.app.service.EndUserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class EndUserController {
	
	@Autowired
	private EndUserService endUserService;

	@GetMapping(value = "/patientinfo/critical")
	public ResponseEntity<?> endUserDetails(EndUser endUser, String quarantinetype, Long qid){
		
		return endUserService.endUserDetails(endUser,quarantinetype,qid);
	}
}
