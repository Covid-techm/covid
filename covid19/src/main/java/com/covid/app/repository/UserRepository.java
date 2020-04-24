package com.covid.app.repository;


import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.cloud.gcp.data.datastore.repository.query.Query;
import org.springframework.data.repository.query.Param;

import com.covid.app.model.User;

public interface UserRepository extends DatastoreRepository<User,Long> {
	@Query(value = "select * from loginUser where userName=@username")
    User findByUserName(@Param("username") String username);
    
}
