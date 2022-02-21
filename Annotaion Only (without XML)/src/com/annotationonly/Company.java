package com.annotationonly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component          //its id name = company (camel case)
public class Company {
	
	@Value("mast cheez")
	String companyName;
	@Value("${company.address}")
	String companyAdd;
	
	@Autowired
	@Qualifier("softwareEngineer")  //in camelcase
	Engineer engineer;
	
	/*
	public Company(SoftwareEngineer engineer) {
		   this.engineer = engineer;
		   System.out.println("i am constructor 11");
	}	*/
	/*
	public void setEngineer(SoftwareEngineer engineer) {
		this.engineer = engineer;
		System.out.println("I am setter");
	}	*/

	public void showInfo() {
		System.out.println("Details here");
		System.out.println("company name - "+companyName);
		System.out.println("company address - "+companyAdd);
	}
}
