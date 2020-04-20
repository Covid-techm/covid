package com.covid.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.data.datastore.core.DatastoreTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.monitor;
import com.covid.app.repository.MonitorRepository;
import com.covid.app.shared.SuccessResponse;
import com.google.common.collect.Lists;

@Service
public class CreateMonitorsServiceImpl implements CreateMonitorsService {

	@Autowired
	private MonitorRepository createMonitorsRepository;

	@Autowired
	private DatastoreTemplate dataStoreTemplate;

	@Override
	public ResponseEntity<SuccessResponse> saveMonitor(monitor createMonitors) {
		this.createMonitorsRepository.save(createMonitors);

		SuccessResponse success = new SuccessResponse();
		success.setSuccessCode(HttpStatus.OK.value());
		success.setMessage("Profile has been created successfully");

		return new ResponseEntity<SuccessResponse>(success, HttpStatus.OK);

	}

	@Override
	public Iterable<monitor> getAllMonitors() {
		Iterable<monitor> monitor = this.createMonitorsRepository.findAll();
		return Lists.newArrayList(monitor);
	}

	@Override
	public List<monitor> getMonitorByPinCode(Long pinCode) {
		// TODO Auto-generated method stub
		return createMonitorsRepository.getMonitorByPincode(pinCode);
	}

	@Override
	public long getTotalMonitors() {
		// TODO Auto-generated method stub
		return dataStoreTemplate.count(monitor.class);
	}

}
