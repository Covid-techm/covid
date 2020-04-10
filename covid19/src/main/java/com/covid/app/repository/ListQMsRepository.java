package com.covid.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covid.app.model.ListQMs;
import com.covid.app.model.ViewQMsDetails;

@Repository
public interface ListQMsRepository extends CrudRepository<ListQMs, Long>{
	

	Iterable<ListQMs> findAll();
}
