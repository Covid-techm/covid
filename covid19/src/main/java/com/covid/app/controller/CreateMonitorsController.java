package com.covid.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.covid.app.model.monitor;
import com.covid.app.service.CreateMonitorsService;
import com.covid.app.shared.SuccessResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class CreateMonitorsController {
	
	@Autowired
	private CreateMonitorsService createMonitorsService;
	
	@PostMapping(value = "/createMonitors")
	public ResponseEntity<SuccessResponse> createMonitors(@RequestBody monitor createMonitors) {
		return createMonitorsService.saveMonitor(createMonitors);
	}

	@RequestMapping(value = "/listMonitor", method = RequestMethod.GET)
	public Iterable<monitor> getAllMonitors() {
		return createMonitorsService.getAllMonitors();
	}
}
