package com.covid.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covid.app.constants.iQueryConstants;
import com.covid.app.model.ListMonitors;

@Repository
public interface ListMonitorsRepository extends CrudRepository<ListMonitors, Long> {

	Iterable<ListMonitors> findAll();

	Optional<ListMonitors> findByPincode(Long pincode);
	
	@Query(value = iQueryConstants.SEARCH_MONITOR_BY_PINCODE_QUERY, nativeQuery = true)
	List<ListMonitors> getMonitorByPincode(String pinCode, String zone);
	
}
