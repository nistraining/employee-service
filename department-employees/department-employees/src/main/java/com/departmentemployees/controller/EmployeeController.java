package com.departmentemployees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.departmentemployees.VO.ResponseTemplateVO;
import com.departmentemployees.entity.Employees;
import com.departmentemployees.service.EmployeeServices;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public Employees  saveEmployee(@RequestBody Employees employee)
	{
		return employeeService.registerEmployee(employee);
	}
	
	@RequestMapping("/employees/{employeeId}")
	public ResponseTemplateVO getEmployeesWithDepartment(@PathVariable Long employeeId)
	{
		return employeeService.getEmployeesWithDepartment(employeeId);
	}

}
