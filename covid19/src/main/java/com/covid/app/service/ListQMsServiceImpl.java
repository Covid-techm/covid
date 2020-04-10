package com.covid.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.covid.app.model.ListQMs;
import com.covid.app.model.ViewQMsDetails;
import com.covid.app.repository.ListQMsRepository;
import com.covid.app.repository.ViewQMsDetailsRepository;

@Service
public class ListQMsServiceImpl implements ListQMsService {
	
	@Autowired
	private ListQMsRepository listQMsRepository;
	
	@Autowired
	private ViewQMsDetailsRepository viewQMsDetailsRepository;
	
	public Iterable<ListQMs> getAllQMs(){	
		return listQMsRepository.findAll();	
	}
	
	public ResponseEntity<?> viewQMsDetails(ViewQMsDetails viewQMsDetails, Long qid){
		
		Optional<ViewQMsDetails> viewdetails = viewQMsDetailsRepository.findById(qid);
		
		if(viewdetails.get().getQid().equals(qid)) {
			
			return new ResponseEntity<>(viewdetails, HttpStatus.OK);
		}
		
		return null;
	}

}
