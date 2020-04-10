package com.covid.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.HealthStatus;
import com.covid.app.model.ListMonitors;
import com.covid.app.repository.HealthStatusRepository;
import com.covid.app.repository.ListMonitorsRepository;


@Service
public class HealthStatusServiceImpl implements HealthStatusService {

	@Autowired
	private HealthStatusRepository healthStatusRepository;

	@Autowired
	private ListMonitorsRepository listMonitorsRepository;

	public ResponseEntity<?> assignMonitor(ListMonitors listMonitors, Long pincode) {

		Optional<ListMonitors> ms = listMonitorsRepository.findByPincode(pincode);

		if (ms.get().getPincode().equals(pincode)) {

			return new ResponseEntity<>(ms, HttpStatus.OK);
		}

		return null;

	}

	public ResponseEntity<?> saveStatus(HealthStatus healthStatus) {

		healthStatusRepository.save(healthStatus);

		return new ResponseEntity<>(HttpStatus.OK);

	}
}
