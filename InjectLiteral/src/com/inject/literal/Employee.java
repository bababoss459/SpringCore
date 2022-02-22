package com.inject.literal;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("${employee.name}")			//don't call internally setter
	private String empName;
	
	@Value("${employee.id}")
	private int empId;
	
	@Value("${employee.skills}")
	private String empOtherSkills;
	
	/*
	@Value("${employee.name}")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Value("${employee.id}")
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Value("${employee.skills}")
	public void setEmpOtherSkills(String empOtherSkills) {
		this.empOtherSkills = empOtherSkills;
	}
	*/
	public void showDetails() {
		System.out.println("Employee Nane Is - "+empName);
		System.out.println("Employee ID Is - "+empId);
		System.out.println("Employee Other Skills Are - "+empOtherSkills);
	}
}
