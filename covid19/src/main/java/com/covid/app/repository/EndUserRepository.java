package com.covid.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covid.app.model.EndUser;

@Repository
public interface EndUserRepository extends CrudRepository<EndUser, Long>{
	
	Optional<EndUser> findByQuarantinetype(String quarantinetype);
	
	
	
}
