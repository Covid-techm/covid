package com.covid.app.repository;

import java.util.List;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.cloud.gcp.data.datastore.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.covid.app.model.monitor;

@Repository
public interface MonitorRepository extends DatastoreRepository<monitor, Long> {

	@Query(value = "select * from monitor where pinCode=@pinCode")
	List<monitor> getMonitorByPincode(@Param("pinCode") Long pinCode);

}
