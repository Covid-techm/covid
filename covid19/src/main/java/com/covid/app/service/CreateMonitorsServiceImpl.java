package com.covid.app.service;

import org.springframework.beans.factory.annotation.Autowired;
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

}
