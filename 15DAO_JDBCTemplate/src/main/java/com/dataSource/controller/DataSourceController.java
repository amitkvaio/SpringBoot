package com.dataSource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dataSource.daoImp.EmployeeDAOImpl;
import com.dataSource.model.Employee;

@RestController
public class DataSourceController {
	
	@Autowired
	@Qualifier("EmployeeDAOImpl")
	private EmployeeDAOImpl  dao;
	
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public List<Employee> getEmployeeInfo(){
		return dao.getTotalEmployeeDetails();
	}
	
	@GetMapping(value="/int")
	public String getTotalEmployeeCount(){
		return dao.getTotalEmployeeCountInInt();
	}
	
	@RequestMapping("/long")
	public String getTotalEmployeeCountInLong(){
		return dao.getTotalEmployeeCountInLong();
	}
	
	@RequestMapping("/empid")
	public Employee getSingleEmpDetails(){
		int empId = 46978;
		return dao.getEmployeeDetailsWithEmpId(empId);
	}
	
	//@PutMapping("/insert")
	@PostMapping(value="/insert",produces = "application/json")
	public String insertEmployee(){
		String fristNmame ="RajaRaja";
		String lastName = "Rajau";
		int age = 29;
		int empId = 46987;
		int count = dao.insert(fristNmame, lastName, age, empId);
		return count + " recodes has inserted successfully!!";
	}
	
	//@RequestMapping("/update")
	@PatchMapping(value="/update")
	public String updateEmployee(){
		int empId = 469782;
		String fristNmame ="Amit_update";
		int count = dao.update(fristNmame, empId);
		return count + " records has updated";
	}
	//@RequestMapping(value="/employee",method=RequestMethod.PATCH)
	@DeleteMapping(value="/delete")
	public String deleteEmployee(){
		int empId = 46978;
		int count = dao.deleteEmployee(empId);
		return count + " records has deleted";
	}
}
