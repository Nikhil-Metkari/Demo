package com.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.Employee;

public interface EmpService extends JpaRepository<Employee, Long> {

}
