package com.covid.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covid.app.model.ListMonitors;

@Repository
public interface ListMonitorsRepository extends CrudRepository<ListMonitors, Long> {

	Iterable<ListMonitors> findAll();

	Optional<ListMonitors> findByPincode(Long pincode);
	
}
