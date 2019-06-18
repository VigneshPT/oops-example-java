package org.amdocs;

public class Car extends WheeledVehicle{
	
	public String make;
	public String model;

	
	public void move() {
		ignition();
		accelerate();
		System.out.println("car is moving");
	}

	public void stop() {
		brake();
		System.out.println("car is stopped");
	}
	
	public int wheels = 4;
	public Car(String make, String model) {
		super();
		this.wheels = 4;
		this.make = make;
		this.model = model;
		System.out.println("created a new car of "+ make + " and model " + model);
	}
	
	private void ignition() {
		System.out.println("starting the car by ignition");
	}
	
	private void accelerate() {
		System.out.println("pressing the accelerator");
	}
	
	private void brake() {
		System.out.println("applied brakes");
	};
	
	// To explain Polymorphism by function overloading.
	
	public enum BrakeTypes {
		EMERGENCY_BRAKE, LEG_BRAKE;
	}
	
	private void brake(BrakeTypes brake) {
		if(brake == BrakeTypes.EMERGENCY_BRAKE) {
			System.out.println("applied the emergency brakes");
		} else if (brake == BrakeTypes.LEG_BRAKE) {
			System.out.println("applied the ordinary brakes");
		}
	}
	
	public void stop(BrakeTypes brakeType) {
		brake(brakeType);
		System.out.println("car is stopped immediately");
	}
}
