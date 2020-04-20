package com.covid.app.controller;

import java.util.List;
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

import com.covid.app.model.CreateQMs;
import com.covid.app.service.ListQMsService;
import com.covid.app.shared.ErrorResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class ListQMsController {

	@Autowired
	private ListQMsService listQMsService;

	@RequestMapping(value = "/listQMGRS", method = RequestMethod.GET)
	public Iterable<CreateQMs> getAllQMs() {
		return listQMsService.getAllQMs();
	}

	@RequestMapping(value = "/listQmByPinCode/{qid}", method = RequestMethod.GET, produces = {
			"application/json" })
	public List<CreateQMs> listQmByZoneOrPinCode(@PathVariable("qid") Long qid) {
		return listQMsService.getQmByPinCode(qid);
	}

	@RequestMapping(value = "/qmsdetails/{qid}", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<?> viewDetails(CreateQMs viewQMsDetails, @PathVariable("qid") Long qid) {

		return listQMsService.viewQMsDetails(viewQMsDetails, qid);

	}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		error.setMessage("No records found");

		return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);

	}
}