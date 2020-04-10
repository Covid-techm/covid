package com.covid.app.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.covid.app.model.ListMonitors;
import com.covid.app.model.ListQMs;
import com.covid.app.model.ViewMonitorsDetails;
import com.covid.app.model.ViewQMsDetails;
import com.covid.app.service.ListMonitorsService;
import com.covid.app.service.ListQMsService;
import com.covid.app.shared.ErrorResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class ListMonitorsController {
	
	@Autowired
	private ListMonitorsService listMonitorsService;
	
	@RequestMapping(value="/listmonitors", method=RequestMethod.GET)
	public Iterable<ListMonitors> getAllMonitors(){
		return listMonitorsService.getAllMonitors();
}
	
	@RequestMapping(value = "/monitordetails/{mid}", method=RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<?> viewDetails(ViewMonitorsDetails viewMonitorsDetails, @PathVariable("mid") Long mid){

		return listMonitorsService.viewMonitorsDetails(viewMonitorsDetails, mid);

	}
	
	@ExceptionHandler(NoSuchElementException.class)
	  public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {  
		  ErrorResponse error = new ErrorResponse();
	  	  error.setErrorCode(HttpStatus.NOT_FOUND.value());
	  	  error.setMessage("No records found");
	  		
	  	return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);
	  
	 }

}
