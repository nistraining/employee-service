package com.departmentemployees.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="tbl_employee")
public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String address;
	private String sex;
	private String age;
	private String dob;
	private String city;
	private String email;
	private String contactno;
	private String designation;
	
	private Long departmentId;

}
