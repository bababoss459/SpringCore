package com.di;

public class Bike {
	String color;

//	public Bike() {
//		System.out.println("creation of object");
//	}
	
    public Bike(String color) {
	    this.color = color;
	    System.out.println("I am constructor");
	}
	public void setColor(String color) {
		this.color = color;
		System.out.println("I am setter");
	}

	public void showColor() {
		System.out.println("Your Color is = "+color);
	}
	
}
