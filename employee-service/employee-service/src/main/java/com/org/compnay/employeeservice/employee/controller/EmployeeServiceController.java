package com.org.compnay.employeeservice.employee.controller;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.org.compnay.employeeservice.bean.EmployeeBean;
import com.org.compnay.employeeservice.services.EmployeeServices;

@RestController
public class EmployeeServiceController {
	 
	private static final Logger LOGGER = LogManager.getLogger(EmployeeServiceController.class);
    @Autowired
	private EmployeeServices employeeService;
    @Autowired
    Environment environment;
	
	@GetMapping("/employee-service/getUserDetails/{empId}")
	public EmployeeBean getemployeeDetails(@PathVariable String empId)
	{
		EmployeeBean responseEmpObj =new EmployeeBean();
		Optional<EmployeeBean> responseEmpObjOptional =	employeeService.getemployeeDetails(empId);
		if( responseEmpObjOptional.isPresent()) {
			 responseEmpObj = responseEmpObjOptional.get();
			 responseEmpObj.setPort(environment.getProperty("local.server.port"));  
			}
		LOGGER.info("{}",responseEmpObj);
		return responseEmpObj;
		
	}

}
