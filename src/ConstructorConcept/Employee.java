package ConstructorConcept;

public class Employee {
	
	String name;
	int id;
	int age;
	double salary;
	boolean isPerm;
	char gender;
	
	//constructor:
	//name of the const...will be same as the class name
	//const.. can not have any return type, no void, no return
	//const.. will be called when you create the object of the class
	//const.. can be public or private 
	
/*const and function difference:
------------------------------------------------------
	function may or may not return value, but const.. will never return any value
	function name can be anything, but const.. name will be same as class name
	function will have the business/feature logic... but const..will be helping to create the object
	To call the function, we need to create the object and use object ref variable
	but to call the const...just create thje object and supply the values
	 
*/
	
	//1. defaul const...
	public Employee() {
		System.out.println("default const...");
	}
	
	//1. 1 param const...
	public Employee (int a) {
		System.out.println("1 param  const..." +a);
	}
	
	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	public Employee(String name, int id, int age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
	
	public Employee(String name, boolean isPerm) {
		this.name=name;
		this.isPerm=isPerm;
	}

	public Employee(String name, int id, int age, double salary, boolean isPerm, char gender) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
		this.gender = gender;
	}

	public Employee(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	
	
	
	

}
