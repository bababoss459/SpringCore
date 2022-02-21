package com.autowire;

public class Company {
	HRDept dept;
	
	public Company (HRDept dept) {
	    this.dept = dept;
	    System.err.println("const !!");
	}
	public void setDept(HRDept dept) {
		this.dept = dept;
		System.err.println("setter !!");
	}
	public void companyWork() {
	    if(dept == null)
	        System.out.println("No Client No Work !!");
	    else
	        dept.work();
	}
}
