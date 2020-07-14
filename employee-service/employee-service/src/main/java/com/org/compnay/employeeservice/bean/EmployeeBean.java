package com.org.compnay.employeeservice.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class EmployeeBean {
	@Id
	private Long Id;
private String empId;
private String eName;
private String eAddress;
private String port;


public EmployeeBean() {
	
}



public Long getId() {
	return Id;
}



public void setId(Long id) {
	Id = id;
}



public String getEmpId() {
	return empId;
}



public void setEmpId(String empId) {
	this.empId = empId;
}



public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String geteAddress() {
	return eAddress;
}
public void seteAddress(String eAddress) {
	this.eAddress = eAddress;
}
public String getPort() {
	return port;
}
public void setPort(String port) {
	this.port = port;
}



@Override
public String toString() {
	return "EmployeeBean [Id=" + Id + ", empId=" + empId + ", eName=" + eName + ", eAddress=" + eAddress + ", port="
			+ port + "]";
}


}
