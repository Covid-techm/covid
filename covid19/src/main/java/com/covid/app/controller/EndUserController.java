package com.covid.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.app.model.EndUser;
import com.covid.app.model.Monitor;
import com.covid.app.service.EndUserService;
import com.covid.app.shared.SuccessResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class EndUserController {
	
	@Autowired
	private EndUserService endUserService;
	
	
	@GetMapping("/assignMonitorEndUser/{pinCode}")
	public List<Monitor> assignMonitorEndUser(Monitor monitor, 
			@PathVariable("pinCode") Long pinCode){
		
		return endUserService.assignMonitorEndUser(monitor, pinCode);
		
	}
		
	@PostMapping("/addEndUser")	
	public ResponseEntity<SuccessResponse> addEndUser(@RequestBody EndUser endUser){
		
		return endUserService.addEndUser(endUser);
		
	}
	
	@GetMapping("/listEndUsers")
	public Iterable<EndUser> listEndUsers(EndUser endUser){
		
		return endUserService.listEndUsers(endUser);
		
	}
	
	@GetMapping("/patientDetails/{id}")	
	public Optional<EndUser> patientDetails(EndUser endUser, 
			@PathVariable("id") Long id){
		
		return endUserService.patientDetails(endUser, id);
		
	}
	
	@GetMapping(value = "totalCases")
	public long getTotalCases() {
		
		return endUserService.getTotalCases();
		
	}
	

}
