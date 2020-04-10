package com.covid.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.covid.app.model.ViewQMsDetails;

public interface ViewQMsDetailsRepository extends CrudRepository<ViewQMsDetails, Long>{
	
	Optional<ViewQMsDetails> findById(Long qid);

}
