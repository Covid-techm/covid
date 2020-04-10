package com.covid.app.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.ListQMs;
import com.covid.app.model.ViewQMsDetails;

@Service
public interface ListQMsService {
	
	public Iterable<ListQMs> getAllQMs();
	
	public ResponseEntity<?> viewQMsDetails(ViewQMsDetails viewQMsDetails, Long qid);

}
