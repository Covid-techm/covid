package com.covid.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covid.app.model.CreateQMs;

@Repository
public interface CreateQMsRepository extends CrudRepository<CreateQMs, Long>{

}
