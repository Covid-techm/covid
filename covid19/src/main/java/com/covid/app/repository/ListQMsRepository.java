package com.covid.app.repository;

import java.util.List;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.cloud.gcp.data.datastore.repository.query.Query;
import org.springframework.stereotype.Repository;

import com.covid.app.model.CreateQMs;

@Repository
public interface ListQMsRepository extends DatastoreRepository<CreateQMs, Long> {

	@Query(value = "select * from qurantinemanagers where pincode=? or zone=?", exists = true)
	List<CreateQMs> getQms(String pinCode, String zone);
}
