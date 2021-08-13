package com.departmentemployees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.departmentemployees.VO.ResponseTemplateVO;
import com.departmentemployees.entity.Department;
import com.departmentemployees.entity.Employees;
import com.departmentemployees.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate resttemplate;
	
	public Employees registerEmployee(Employees employee)
	{
		return employeeRepository.save(employee);
	}

	
	public ResponseTemplateVO getEmployeesWithDepartment(Long employeeId)
	{
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Employees employees = employeeRepository.findByEmployeeId(employeeId);
		
		String url = "http://DEPARTMENTAL-SERVICE/departments/";
		 Department department =
				 resttemplate.getForObject(url + employees.getDepartmentId()
	                        ,Department.class);

		
		vo.setEmployees(employees);
		vo.setDepartment(department);
		return vo;
	}
}
