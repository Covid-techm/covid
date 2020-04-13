package com.covid.app.service;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.ListQMs;
import com.covid.app.model.QMDashBoardModel;
import com.covid.app.model.ViewQMsDetails;

@Service
public interface ListQMsService {
	
	public Iterable<ListQMs> getAllQMs();
	public List<ListQMs> searchQmgrByPincode(String pinCode,String zone);
	public ResponseEntity<?> viewQMsDetails(ViewQMsDetails viewQMsDetails, Long qid);
	public List<QMDashBoardModel> viewQMDashBoardService();

}
