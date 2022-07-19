package ConstructorConcept;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name="Tom";
		e1.age = 25;
		e1.id = 100;
		e1.salary=1000;
		e1.isPerm = true;
		e1.gender = 'm';
		
		//Employee e2 = new Employee(10);
		Employee e2 = new Employee("Poornima", 101);
		System.out.println(e2.name+" "+e2.id+" "+e2.age+" "+e2.isPerm+" "+e2.gender);
		
		Employee e3 = new Employee("peter", 202, 30, 23.44, true, 'm');
		System.out.println(e3.name+" "+e3.id+" "+e3.salary+" "+e3.age+" "+e3.isPerm+" "+e3.gender);
		
		
		

	}

}
