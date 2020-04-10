package com.covid.app.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.ListMonitors;
import com.covid.app.model.ViewMonitorsDetails;

@Service
public interface ListMonitorsService {
	
	public Iterable<ListMonitors> getAllMonitors();
	
	public ResponseEntity<?> viewMonitorsDetails(ViewMonitorsDetails viewMonitorsDetails, Long mid);


}
