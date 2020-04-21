package com.covid.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.app.model.CreateQMs;
import com.covid.app.service.CreateQMsService;
import com.covid.app.shared.SuccessResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class CreateQMsController {
	
	@Autowired
	private CreateQMsService createQMsService;
	
	@PostMapping(value = "/createQMDetails" )
	public ResponseEntity<SuccessResponse> createQMs(@RequestBody CreateQMs createQMs){
		
		return createQMsService.createQMs(createQMs);
		
	}
	
	@GetMapping(value = "totalQMGRS")
	public long getTotalQMGRS() {
		
		return createQMsService.getTotalQMGRS();
		
	}


}
