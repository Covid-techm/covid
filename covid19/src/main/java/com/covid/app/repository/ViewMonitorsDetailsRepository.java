package com.covid.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.covid.app.model.ViewMonitorsDetails;


public interface ViewMonitorsDetailsRepository extends CrudRepository<ViewMonitorsDetails, Long>{

	Optional<ViewMonitorsDetails> findById(Long idnumber);
	
}
