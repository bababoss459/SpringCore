package com.depinj;

public class Car {
	Engine engine;
	
	public Car(Engine engine) {
	    this.engine = engine;
	    System.out.println("i am Car Constructor!!");
	}
	public void startEngine() {
		if (engine == null)
			System.out.println("Unable to start your engine");
		else
			engine.start();
	}

}
