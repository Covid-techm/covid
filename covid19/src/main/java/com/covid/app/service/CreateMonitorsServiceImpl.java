package com.covid.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Service;

import com.covid.app.model.monitor;
import com.covid.app.repository.MonitorRepository;
import com.covid.app.shared.SuccessResponse;

@Service
public class CreateMonitorsServiceImpl implements CreateMonitorsService {

	@Autowired
	private MonitorRepository createMonitorsRepository;

	

	@Override
//	@ShellMethod("Saves a monitor to Cloud Datastore: save-monitor <title> <author> <year>")
	public ResponseEntity<SuccessResponse> saveMonitor(monitor createMonitors) {
		this.createMonitorsRepository.save(createMonitors);

		SuccessResponse success = new SuccessResponse();
		success.setSuccessCode(HttpStatus.OK.value());
		success.setMessage("Profile has been created successfully");

		return new ResponseEntity<SuccessResponse>(success, HttpStatus.OK);

	}

}
