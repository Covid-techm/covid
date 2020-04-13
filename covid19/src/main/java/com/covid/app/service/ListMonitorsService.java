package com.covid.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.ListMonitors;
import com.covid.app.model.ListQMs;
import com.covid.app.model.ViewMonitorsDetails;

@Service
public interface ListMonitorsService {
	
	public Iterable<ListMonitors> getAllMonitors();
	
	public ResponseEntity<?> viewMonitorsDetails(ViewMonitorsDetails viewMonitorsDetails, Long mid);
	public List<ListMonitors> searchMonitorByPincode(String pinCode,String zone);


}
