package com.covid.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covid.app.model.HealthStatus;

@Repository
public interface HealthStatusRepository extends CrudRepository<HealthStatus, Long>{

}
