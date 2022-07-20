package OOP_InheritanceConcept;

public class BMW extends Car {
	
	// Method Overrding: Poly (Many) + Morphism: RunTime(Dynamic)
	// when you have a method in parent class as well as in child class
	// with the same name
	// and with the same number of parameters
	// and same return type / signature
	// private methods can not be overridden
	// multiple inhertiance is not allowed in java in terms of classes.
	// static method cannot be overridden
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
	
	
//	public static void drive() {
//		System.out.println("BMW -- drive");
//	}
	
	
	
	
}
