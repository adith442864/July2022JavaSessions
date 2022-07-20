package OOP_InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); //overridden
		b.stop(); //inherited
		b.refuel();//inherited
		b.autoParking(); //individual
		b.engine();
		BMW.drive();
	
		System.out.println("----------");
		
		Audi a1 = new Audi();
		a1.start();
		a1.stop();
		a1.refuel();
		a1.theftSafety();
		a1.sportsMode();
		
		System.out.println("----------");
		
		Car c = new Car();
		c.start(); //parent
		c.stop(); //parent
		c.refuel(); //parent
//		c.autoparking() -->method reference type security check. 
		c.engine();
		Car.drive();
	
		System.out.println("----------");
		
		//child class object can be referred by parent class ref variable:
		//top casting
		Car c1 = new BMW();
		c1.start(); //overridden
		c1.stop();
		c1.refuel();
		c1.engine();
		
		System.out.println("----------");
		//child class object can be referred by grant parent class ref variable:
		Vehicle v1 =  new BMW();
		v1.engine();
		v1.start(); //BMW
		
		//down casting: not allowed in java at runtime
		//parent class object can be referred by child class ref variable:
//		BMW b1 = (BMW) new Car();
//		b1.start(); //java.lang.ClassCastException
		
		
		//Grant parent class object can be referred by child class ref variable:
//		BMW b2 = (BMW) new Vehicle();

	}

}
