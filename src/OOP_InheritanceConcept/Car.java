package OOP_InheritanceConcept;

public class Car extends Vehicle {
	
	//final class -- can not be a parent : preventing Inheritance
	//final method --  can not be overriden
	//static method cannot be overridden
	
	public final void logo() {
		System.out.println("Car -- logo");
	}

	@Override
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public static void drive() {
		System.out.println("Car -- drive");
	}

}
