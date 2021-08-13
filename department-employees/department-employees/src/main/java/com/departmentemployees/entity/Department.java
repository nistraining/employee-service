package com.departmentemployees.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	
	
	private Long departmentId;
	private String departmentName;
	private String departmentCode;
	private String departmentemail;
	private String departmentAddress;

}