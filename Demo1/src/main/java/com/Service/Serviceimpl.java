package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Employee;

@Service
public class Serviceimpl {

	@Autowired
	private EmpService empservice;
	
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return empservice.findAll();
	}

	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empservice.save(emp);
	}

	public void deleteemployee(long id) {
		empservice.deleteById(id);
		
	}

	public void updateEmployee(Employee emp) {
		empservice.save(emp);
		
	}

	public Optional<Employee> getempbyid(long id ) {
		
		return empservice.findById(id);
	}

	
	


	

	
}
