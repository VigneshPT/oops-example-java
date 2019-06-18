package org.amdocs;

public class Motorcycle extends WheeledVehicle {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		kickStart();
		throttle();
		System.out.println("motorcycle is moving");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		brake();
		System.out.println("motorcycle is stopped");
	}
	public String make;
	public String model;
	
	public Motorcycle(String make, String model) {
		this.wheels = 2;
		this.make = make;
		this.model = model;
		System.out.println("created a motorcycle of make "+ make + " and model "+ model);
	}
	
	private void kickStart() {
		System.out.println("Kicked the kicker to start the bike");
	}
	
	private void throttle() {
		System.out.println("Raised the throttle");
	}
	
	private void brake() {
		System.out.println("applied the brakes");
	}

}
