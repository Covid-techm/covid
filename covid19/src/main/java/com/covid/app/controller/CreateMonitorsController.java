package com.covid.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.app.model.CreateMonitors;
import com.covid.app.service.CreateMonitorsService;
import com.covid.app.shared.SuccessResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class CreateMonitorsController {
	
	@Autowired
	private CreateMonitorsService createMonitorsService;
	
	@PostMapping(value = "/addMonitor" )
	public ResponseEntity<SuccessResponse> addMonitor(@RequestBody CreateMonitors createMonitors){
		
		return createMonitorsService.addMonitor(createMonitors);
		
	}

}
