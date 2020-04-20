package com.covid.app.repository;

import java.util.List;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.cloud.gcp.data.datastore.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.covid.app.model.CreateQMs;

@Repository
public interface ListQMsRepository extends DatastoreRepository<CreateQMs, Long> {

	@Query(value = "select * from qurantinemanagers where pincode=@pincode")
	List<CreateQMs> getQms(@Param("pincode") Long pinCode);
	
}
