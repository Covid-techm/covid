package com.covid.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.app.model.EndUser;
import com.covid.app.repository.EndUserRepository;

@Service
public class EndUserServiceImpl implements EndUserService{
	
	@Autowired
	private EndUserRepository endUserRepository;
	
	public ResponseEntity<?> endUserDetails(EndUser endUser, String quarantinetype, Long qid){
		
//		Iterable<EndUser> user = endUserRepository.findAll();
//
//		return new ResponseEntity(user,HttpStatus.OK);
//		}
		
//		Iterable<EndUser> user = endUserRepository.findAll();
//		
//		if(user.) {
//		
//			//Optional<EndUser> userend = endUserRepository.findByQuarantinetype(quarantinetype);
//			return new ResponseEntity(user, HttpStatus.OK);
//		}
		
		return null;
	}

}
