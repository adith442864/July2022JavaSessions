package OOP_Interface;

public interface USMedical extends WHO {
	
	//can not have method body
	//only method prototype -- abstract method(non static method)
	//no method body, only method declaration
	//interface can not have the business logic
	//interface can have the common method, but class will override only once
	//can not create the object of the interface
	
	//The type UN cannot be a superinterface of USMedical; a superinterface must be an interface
	
	public void physioServices();
	
	public void cardioServices();
	
	public void oncologyServices();
	
	public void emergencyServices();
	
	//after JDK 1.8:
	//1. you can have static methods with the body:
	public static void billing() {
		System.out.println("US Medical -- Billing");
	}
	
	//2. can have default method with the body: (non static)
	
	public default void medicalInsurance() {
		System.out.println("US Medical -- medical insurance");
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	
}
