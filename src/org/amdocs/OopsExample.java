package org.amdocs;

public class OopsExample {
	public static void main(String[] args) {
		Car car = new Car("Maruti Suzuki", "Ciaz");
		car.move(); //abstraction of how car moves.. we don't really know what goes behind the move method
		car.stop(); 
		
		Motorcycle royalEnfield = new Motorcycle("RoyalEnfield", "Desert Storm 500");
		royalEnfield.move();
		royalEnfield.stop();
		
		ElectricCar teslaModelX = new ElectricCar("Tesla", "ModelX");
		teslaModelX.move();
		teslaModelX.stop();
	}
}
