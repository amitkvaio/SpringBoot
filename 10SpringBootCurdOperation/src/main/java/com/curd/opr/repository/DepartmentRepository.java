package com.curd.opr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.curd.opr.entity.Department;

@Repository

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}