package AccessModifier_2;

import AccessModifier_1.Car;

public class Audi extends Car {

	public static void main(String[] args) {
		
		Audi a = new Audi();
		
		// Default, Privaite doesn't access
		a.color = "RED";
		a.price =  70;
		
		
		
		
	}

}
