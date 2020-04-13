package com.covid.app.constants;

public interface iQueryConstants {

	public static final String SEARCH_QMGR_BY_PINCODE_QUERY = "select * from qurantinemangeer where pincode=? or zone=?";
	public static final String SEARCH_MONITOR_BY_PINCODE_QUERY = "select * from monitor where pincode=? or zone=?";
	public static final String QM_DASHBOAD_QUERY = "select firstname,lastname,mobilenumber,email,zone,pincode, DATEDIFF(CURDATE(),QuarantineStartDate) as days,symptom  from enduser";

}
