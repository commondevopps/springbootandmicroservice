package com.org.compnay.hrmservice.hrmservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.org.compnay.hrmservice.hrmservice.EmployeeServiceProxy;
import com.org.compnay.hrmservice.hrmservice.bean.EmployeeBean;

@Service
public class HRMService {
	
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	EmployeeServiceProxy employeeServiceProxy;
	
	//called with rest template
	public EmployeeBean getEmployeeDetails(String empId) {
		String URL="http://localhost:8001/employee-service/getUserDetails/{empId}";
		Map<String,String> uriVariables= new HashMap<String,String>();
		uriVariables.put("empId", empId);		
		 ResponseEntity<EmployeeBean> responseEntiry=restTemplate.getForEntity(URL, EmployeeBean.class,uriVariables);
		 return responseEntiry.getBody();
		
	}

	//called with feign client 
	public EmployeeBean getEmployeeDetailsWithProxy(String empId) {
		 ResponseEntity<EmployeeBean> responseEntiry=employeeServiceProxy.getemployeeDetailsProxy(empId);
		 return responseEntiry.getBody();
		
	}
}
