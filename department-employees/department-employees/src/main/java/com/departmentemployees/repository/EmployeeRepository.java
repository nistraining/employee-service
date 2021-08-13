package com.departmentemployees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.departmentemployees.entity.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {

	Employees findByEmployeeId(Long employeeId);

}
