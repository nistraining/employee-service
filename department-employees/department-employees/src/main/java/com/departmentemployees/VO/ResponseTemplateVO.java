package com.departmentemployees.VO;

import com.departmentemployees.entity.Department;
import com.departmentemployees.entity.Employees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	
	private Employees employees;
	private Department department;

}
