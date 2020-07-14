package com.org.compnay.hrmservice.hrmservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("com.org.compnay.hrmservice.hrmservice")
@EnableDiscoveryClient
public class HrmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return  new RestTemplate();
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;

	}
}
