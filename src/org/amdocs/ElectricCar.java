package org.amdocs;

public class ElectricCar extends Car {
	public String battery;
	
	public ElectricCar(String make, String model) {
		super(make, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		electricStart();
		accelerate();
		System.out.println("Electric car is moving.");
	}

	@Override
	public void stop() {
		super.stop();
	}
	
	private void electricStart() {
		System.out.println("Nothing to start. Battery active.");
	}
	
	private void accelerate() {
		System.out.println("accelerating by battery");
	}
}
