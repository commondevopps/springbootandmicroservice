package com.org.compnay.employeeservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.org.compnay.employeeservice.bean.EmployeeBean;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeBean, Long> {

	Optional<EmployeeBean> findByEmpId(@PathVariable String empIds);

}
