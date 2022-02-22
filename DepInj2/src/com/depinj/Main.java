package com.depinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Bike bike = ac.getBean("bike", Bike.class);
		bike.startEngine();
	   /*
	    * if we write 
	    Bike bike22 = ac.getBean("bike", Bike.class);
		bike22.startEngine();
		
		only one bean will be created for bike
		but referenced by both bike & bike 22
	    */
		
		Car car = (Car)ac.getBean("car");
		car.startEngine();
	}

}
