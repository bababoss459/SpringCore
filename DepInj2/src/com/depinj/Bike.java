package com.depinj;

public class Bike {
	
	Engine engine;
	
	public Bike(Engine engine) {
	    this.engine = engine;
	    System.out.println("i am Bike Constructor!!");
	}
	public void startEngine() {
		if (engine == null)
			System.out.println("Unable to start your engine");
		else
			engine.start();
	}
}
