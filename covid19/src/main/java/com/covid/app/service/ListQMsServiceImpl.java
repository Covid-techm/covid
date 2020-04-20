package com.covid.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.CreateQMs;
import com.covid.app.repository.ListQMsRepository;

@Service
public class ListQMsServiceImpl implements ListQMsService {

	@Autowired
	private ListQMsRepository listQMsRepository;


	public Iterable<CreateQMs> getAllQMs() {
		return listQMsRepository.findAll();
	}
	

	public ResponseEntity<?> viewQMsDetails(CreateQMs viewQMsDetails, Long qid) {

	Optional<CreateQMs> viewdetails = listQMsRepository.findById(qid);

		if (viewdetails.get().getQid().equals(qid)) {

			return new ResponseEntity<>(viewdetails, HttpStatus.OK);
		}

		return null;
	}

	@Override
	public List<CreateQMs> getQmByPinCode(String pinCode,String zone) {
		return listQMsRepository.getQms(pinCode, zone);
	}
	

}
