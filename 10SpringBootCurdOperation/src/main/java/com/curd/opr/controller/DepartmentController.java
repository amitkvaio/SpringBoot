package com.curd.opr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.curd.opr.entity.Department;
import com.curd.opr.response.ApiResponse;
import com.curd.opr.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	public ResponseEntity<ApiResponse<Department>> saveDepartment(@Validated @RequestBody Department department) {
		Department savedDepartment = departmentService.saveDepartment(department);
		ApiResponse<Department> response = new ApiResponse<>(HttpStatus.CREATED.value(),
				"Department created successfully", savedDepartment);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<ApiResponse<List<Department>>> fetchDepartmentList() {
		List<Department> departments = departmentService.fetchDepartmentList();
		ApiResponse<List<Department>> response = new ApiResponse<>(HttpStatus.OK.value(),
				"Departments fetched successfully", departments);
		return ResponseEntity.ok(response);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ApiResponse<Department>> updateDepartment(@RequestBody Department department,
			@PathVariable("id") Long departmentId) {
		Department updated = departmentService.updateDepartment(department, departmentId);
		ApiResponse<Department> response = new ApiResponse<>(HttpStatus.OK.value(), "Department updated successfully",
				updated);
		return ResponseEntity.ok(response);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse<String>> deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		ApiResponse<String> response = new ApiResponse<>(HttpStatus.OK.value(), "Department deleted successfully",
				"Deleted Successfully");
		return ResponseEntity.ok(response);
	}
}
