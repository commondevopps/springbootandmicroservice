package com.org.compnay.SpringcoludClient.maxminservice.maxminservice.bean;

public class MaxMinConfig {
private	int max;
private 	int min;
	
	
	
	public MaxMinConfig() {
		
	}
	
	public MaxMinConfig(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	

}
