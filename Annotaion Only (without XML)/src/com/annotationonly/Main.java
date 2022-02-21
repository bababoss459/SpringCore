package com.annotationonly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(ConfigClass.class);
						//ClassPathXmlApplicationContext("beans.xml");
		Company company = context.getBean("company", Company.class);
		company.showInfo();
		company.engineer.development();
		
	}

}
