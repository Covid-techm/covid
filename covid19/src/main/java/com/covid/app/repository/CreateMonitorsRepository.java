package com.covid.app.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.covid.app.model.CreateMonitors;

@Repository
public interface CreateMonitorsRepository extends CrudRepository<CreateMonitors, Long>{

}
