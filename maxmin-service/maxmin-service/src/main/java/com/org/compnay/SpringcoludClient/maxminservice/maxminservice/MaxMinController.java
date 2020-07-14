package com.org.compnay.SpringcoludClient.maxminservice.maxminservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.compnay.SpringcoludClient.maxminservice.maxminservice.bean.MaxMinConfig;
import com.org.compnay.SpringcoludClient.maxminservice.maxminservice.configuration.Configuration;

@RestController
public class MaxMinController {

	@Autowired
    private	Configuration configuration;
	
	@GetMapping("max-min")
	public MaxMinConfig retrieveMaxMinConfir()
	{
	
	//	return new MaxMinConfig(100,1000);//hard coded value passed
		
		return new MaxMinConfig(configuration.getMaximun(),configuration.getMinimum());//getting value from application.properties with Configuration class
	}
}
