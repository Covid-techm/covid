package com.covid.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.covid.app.constants.iQueryConstants;
import com.covid.app.model.ListQMs;
import com.covid.app.model.QMDashBoardModel;
import com.covid.app.model.ViewQMsDetails;
import com.covid.app.repository.ListQMsRepository;
import com.covid.app.repository.ViewQMsDetailsRepository;

@Service
public class ListQMsServiceImpl implements ListQMsService {

	@Autowired
	private ListQMsRepository listQMsRepository;

	@Autowired
	private ViewQMsDetailsRepository viewQMsDetailsRepository;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Iterable<ListQMs> getAllQMs() {
		return listQMsRepository.findAll();
	}

	public ResponseEntity<?> viewQMsDetails(ViewQMsDetails viewQMsDetails, Long qid) {

		Optional<ViewQMsDetails> viewdetails = viewQMsDetailsRepository.findById(qid);

		if (viewdetails.get().getQid().equals(qid)) {

			return new ResponseEntity<>(viewdetails, HttpStatus.OK);
		}

		return null;
	}

	@Override
	public List<ListQMs> searchQmgrByPincode(String pinCode, String zone) {
		return listQMsRepository.getQms(pinCode, zone);
	}

	@Override
	public List<QMDashBoardModel> viewQMDashBoardService() {
		List<QMDashBoardModel> QMDataList = new ArrayList<QMDashBoardModel>();
		try {
			List<Map<String, Object>> listQMData = jdbcTemplate.queryForList(iQueryConstants.QM_DASHBOAD_QUERY);
			for (Map map : listQMData) {
				QMDashBoardModel model = new QMDashBoardModel();
				model.setFirstname((String) map.get("firstname"));
				model.setLastname((String) map.get("lastname"));
				model.setMobilenumber((String) map.get("mobilenumber"));
				model.setEmail((String) map.get("email"));
				model.setZone((String) map.get("zone"));
				model.setPincode((int) map.get("pincode"));
				model.setQuarentineDays((Long) map.get("days"));
				model.setSymptoms((String) map.get("symptom"));
				QMDataList.add(model);
			}

		} catch (Exception expection) {
			expection.printStackTrace();
		}
		return QMDataList;
	}

}
