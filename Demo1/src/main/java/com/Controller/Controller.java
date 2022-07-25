package com.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Employee;
import com.Service.Serviceimpl;


@RestController
public class Controller {

	@Autowired
	private Serviceimpl service;
	
	@GetMapping("/Employee/all")
	public List<Employee> getEmployee()
	{
		List<Employee> li = service.getEmployee();
		return li;
	}
	 
	@GetMapping("/Employee/byid/{id}")
	public Optional<Employee> getempbyid(@PathVariable long id)
	{
		Optional<Employee> op = service.getempbyid(id);
		return op;
	}
	
	
	@PostMapping("Employee/add")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return service.addEmployee(emp) ;
	}
	
	@DeleteMapping("/Employee/delete/{id}")
	public String deleteemployee(@PathVariable long id){
	try{
		service.deleteemployee(id);
		return "Deteted";
	}
	catch (Exception e ){
		return "Wrong id number";
	}
	}
	
	@PutMapping ("/Employee/update/{id}")
	public void updateEmployee(@RequestBody Employee emp)
	{
		service.updateEmployee(emp);
	}
}
