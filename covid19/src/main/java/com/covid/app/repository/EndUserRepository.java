package com.covid.app.repository;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

import com.covid.app.model.EndUser;

@Repository
public interface EndUserRepository extends DatastoreRepository<EndUser, Long> {

}
