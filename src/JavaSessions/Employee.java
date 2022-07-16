package JavaSessions;

public class Employee {
	
	String name;
	int age;
	String city;
	double salary;
	boolean isPermanent;
	char gender;

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		//e1 -> object reference name
		//RHS -> new Employee() --> is the object
		//Employee -- class / type of e1
			//non primitive data type
		
		e1.name ="Tom";
		e1.age =25;
		e1.city ="Delhi";
		e1.salary =23.33;
		e1.isPermanent =true;
		e1.gender ='m';
		
		System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary+" "+e1.isPermanent+" "+e1.gender);
		
		Employee e2 = new Employee();
		e2.name="Peter";
		System.out.println(e2.name+" "+e2.age+" "+e2.city+" "+e2.salary+" "+e2.isPermanent); //null 0 null 0.0 false
		System.out.println(e2.gender); //blank space is a default value
		
		
		
		
		
		

	}

}
