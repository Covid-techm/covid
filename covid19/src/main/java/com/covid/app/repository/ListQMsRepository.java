package com.covid.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covid.app.constants.iQueryConstants;
import com.covid.app.model.ListQMs;

@Repository
public interface ListQMsRepository extends CrudRepository<ListQMs, Long> {

	@Query(value = iQueryConstants.SEARCH_QMGR_BY_PINCODE_QUERY, nativeQuery = true)
	List<ListQMs> getQms(String pinCode, String zone);
}
