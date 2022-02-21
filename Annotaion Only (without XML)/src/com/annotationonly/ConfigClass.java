package com.annotationonly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.annotationonly")
@PropertySource("classpath:company-info")
public class ConfigClass {
	
}


/*
@Configuration			//like xml configuration
//@ComponentScan(basePackages = "com.annotationonly")
			// SCAN WHOLE PACKAGE
public class ConfigClass {
	
	@Bean	// SCAN SPECIFIC BEAN
	public SoftwareEngineer engineer() { // <---
		return new SoftwareEngineer();   //     |
	}									 //		|
										 //		|  same name 
	@Bean								 //		|  engineer()
	public Company company() {//setter	 //		|
		Company company =  new Company();//		|
		company.setEngineer(engineer()); // <----
		return company;
	}
	
//	@Bean
//	public Company company() {			 //through constructor
//		Company company = new Company(engineer());
//		return company;
//	}		 

}
*/

