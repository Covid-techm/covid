package com.covid.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.app.model.HealthStatus;
import com.covid.app.model.ListMonitors;
import com.covid.app.service.HealthStatusService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class HealthStatusController {
	
	@Autowired
	private HealthStatusService healthStatusService;
	
	@GetMapping(value = "/healthstatus/{pincode}")
	public ResponseEntity<?> assignMonitor(ListMonitors listMonitors, @PathVariable("pincode") Long pincode){
		
		return healthStatusService.assignMonitor(listMonitors, pincode);
	}
	
	@PostMapping(value = "/healthstatusupdate")
	public ResponseEntity<?> saveStatus(@RequestBody HealthStatus healthStatus){
		
		return healthStatusService.saveStatus(healthStatus);
	}

}
