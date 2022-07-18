package JavaSessions;

public class Persons {
	
	//static class is not allowed in java...
	
	public void m1() {
		System.out.println("m1 method...");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method...");
		m3();
		
	}
	
	public void m3() {
		System.out.println("m3 method...");
		p2(); //calling static method in non static method by calling them directly
	}
	
	public static void p1() {
		System.out.println("p1 method...");
		p2();
		Persons pp = new Persons(); //create the object to access non static into static method
		pp.m1();
	}
	
	public static void p2() {
		System.out.println("p2 method...");
		p3();
	}
	
	public static void p3() {
		System.out.println("p3 method...");
	}

	public static void main(String[] args) {
		
		Persons p1 = new Persons();
		p1.m1();
		p1.m2();
		
		Persons.p1();

	}

}
