package com.org.compnay.hrmservice.hrmservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.org.compnay.hrmservice.hrmservice.bean.EmployeeBean;


//name is  name of the service we are calling
//for url only local host and port
//@FeignClient(name="emlpoyee-service",url="localhost:8001")
//to call via ribbon comment the Feign client with URL annotation and provice the url in the application.properties
//@FeignClient(name="emlpoyee-service-name")// commected out this line as we are going to connect via zuul getway
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="emlpoyee-service-name")
public interface EmployeeServiceProxy {

	
	//@GetMapping("/employee-service/getUserDetails/{empId}") // commented out this line as we are going to connect via zuul getway
	@GetMapping("/emlpoyee-service-name/employee-service/getUserDetails/{empId}")
	public ResponseEntity<EmployeeBean> getemployeeDetailsProxy(@PathVariable("empId") String empId);
}
