package JavaSessions;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels=4;
	
	//static class vars should be the common value
	
	//cannot use static in the main method
	//all static vars of the class will be stored inside the 
		//CMA(Common Memory Allocation/Permanent Generation/jdk 1.8 -> metaspace --> dynamic)
	

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name="BMW";
		c1.price=60;
		c1.color="Blue";
		System.out.println(c1.name+" "+c1.price+" "+c1.color);
		
		//how to access static variables
		// no need to create the object
	//1. within the same class, you can access them directly
		System.out.println(wheels);
		
		
		Car c2 = new Car();
		c2.name="Audi";
		c2.price=70;
		c2.color="White";
		System.out.println(c2.name+" : "+c2.price+": "+c2.color);
	//2. you can call by the class name
		System.out.println(Car.wheels);
		
		Car c3 = new Car();
		c3.name="honda";
		c3.price=15;
		c3.color="Black";
		System.out.println(c3.name+" : "+c3.price+" : "+c3.color);
	//3. you can call by object reference
		System.out.println(c3.wheels);
		

	}

}
