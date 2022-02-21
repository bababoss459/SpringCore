package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	@Autowired      	//if doing this, no need of const or setter
	@Qualifier("dept1")
	Dept dept;					
	
	/*
	 
	@Autowired      //then will be injected through constructor
	public Company (@Qualifier("dept2") HRDept dept) { 
					//qualifiler for uniqueness, works in confusion
	    this.dept = dept;
	    //System.err.println("const !!");
	}
	//@Autowired      //then through setter
	//@Qualifier("dept2")
	public void setDept(HRDept dept) {
		this.dept = dept;
		//System.err.println("setter !!");
	}
	
	*/
	public void companyWork() {
	    if(dept == null)
	        System.out.println("No Client No Work !!");
	    else
	        dept.work();
	}
}
