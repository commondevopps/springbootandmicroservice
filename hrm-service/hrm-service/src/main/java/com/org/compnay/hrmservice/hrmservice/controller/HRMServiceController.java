package com.org.compnay.hrmservice.hrmservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.org.compnay.hrmservice.hrmservice.bean.EmployeeBean;
import com.org.compnay.hrmservice.hrmservice.service.HRMService;



@RestController
public class HRMServiceController {
	private static final Logger LOGGER = LogManager.getLogger(HRMServiceController.class);
	@Autowired
	HRMService hrmService;
	
	@GetMapping("/hrm-service/{empId}")
	public EmployeeBean getemployeeDetails(@PathVariable String empId)
	{
		return hrmService.getEmployeeDetails(empId);
		//return "test "+empId;
		
	}
	
	@GetMapping("/hrm-service-feign/{empId}")
	public EmployeeBean getEmployeeDetailsWithProxy(@PathVariable String empId)
	{
		 EmployeeBean objEmployeeBean=hrmService.getEmployeeDetailsWithProxy(empId);
		 LOGGER.info("{}",objEmployeeBean);
		return objEmployeeBean;
		//return "test "+empId;
		
	}
	
}
