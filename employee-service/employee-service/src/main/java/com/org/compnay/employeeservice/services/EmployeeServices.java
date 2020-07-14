package com.org.compnay.employeeservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.compnay.employeeservice.bean.EmployeeBean;
import com.org.compnay.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public Optional<EmployeeBean> getemployeeDetails(String empId) {
		
		Optional<EmployeeBean> employeeBeanobj	=employeeRepository.findByEmpId(empId);
		/* List <EmployeeBean> employeeBeanobj =employeeRepository.findAll() */;
		return employeeBeanobj;
		

	}
}
