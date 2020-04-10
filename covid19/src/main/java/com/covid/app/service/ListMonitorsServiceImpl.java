package com.covid.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.ListMonitors;
import com.covid.app.model.ViewMonitorsDetails;
import com.covid.app.repository.ListMonitorsRepository;
import com.covid.app.repository.ViewMonitorsDetailsRepository;


@Service
public class ListMonitorsServiceImpl implements ListMonitorsService{
	
	@Autowired
	private ListMonitorsRepository listMonitorsRepository;
	
	@Autowired
	private ViewMonitorsDetailsRepository viewMonitorsDetailsRepository;
	
	public Iterable<ListMonitors> getAllMonitors(){	
		return listMonitorsRepository.findAll();	
	}
	
	public ResponseEntity<?> viewMonitorsDetails(ViewMonitorsDetails viewMonitorsDetails, Long mid){
		
		Optional<ViewMonitorsDetails> viewdetails = viewMonitorsDetailsRepository.findById(mid);
		
		if(viewdetails.get().getMid().equals(mid)) {
			
			return new ResponseEntity<>(viewdetails, HttpStatus.OK);
		}
		
		return null;
	
}
}
	
	


