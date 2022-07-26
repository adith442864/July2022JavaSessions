package AccessModifier_2;

import AccessModifier_1.Car;

public class Bike {

	public static void main(String[] args) {
		
		Car c = new Car();
		//default,protected, private properties not allowed...
		c.color = "Green";

	}

}
