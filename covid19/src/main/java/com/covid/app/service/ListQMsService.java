package com.covid.app.service;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.CreateQMs;

@Service
public interface ListQMsService {
	
	public Iterable<CreateQMs> getAllQMs();
	public List<CreateQMs> getQmByPinCode(Long pinCode);
	public ResponseEntity<?> viewQMsDetails(CreateQMs viewQMsDetails, Long qid);

}
