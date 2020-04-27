package com.covid.app.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.data.datastore.core.DatastoreTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.CreateQMs;
import com.covid.app.model.EndUser;
import com.covid.app.model.Monitor;
import com.covid.app.repository.EndUserRepository;
import com.covid.app.repository.MonitorRepository;
import com.covid.app.shared.SuccessResponse;
import com.google.common.collect.Lists;

@Service
public class EndUserServiceImpl implements EndUserService{
	
	@Autowired
	private MonitorRepository monitorRepository;
	
	@Autowired
	private EndUserRepository endUserRepository;
	
	@Autowired
	private DatastoreTemplate dataStoreTemplate;
	
	public List<Monitor> assignMonitorEndUser(Monitor monitor, Long pinCode){
		
		return monitorRepository.getMonitorByPincode(pinCode);
		
		
	}
	
	public ResponseEntity<SuccessResponse> addEndUser(EndUser endUser){
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String sysdate = LocalDate.now().format(format);
		endUser.setQuarantineStartDate(sysdate);
		
		endUserRepository.save(endUser);
		
		SuccessResponse success = new SuccessResponse();
		success.setSuccessCode(HttpStatus.OK.value());
		success.setMessage("User added successfully");

		return new ResponseEntity<SuccessResponse>(success, HttpStatus.OK);

	}
	
	@Override
	public Iterable<EndUser> listEndUsers(EndUser endUser){
				
		Iterable<EndUser> enduser = this.endUserRepository.findAll();
		return Lists.newArrayList(enduser);
	}
	
	public Optional<EndUser> patientDetails(EndUser endUser, Long id){
		
		return endUserRepository.findById(id);
	}
	
	@Override
	public long getTotalCases() {
		return dataStoreTemplate.count(EndUser.class);
		
	}

}
