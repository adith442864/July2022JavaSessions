package ConstructorConcept;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("Tom", 30, "IBM");
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getComp());
		
		//update the values
		c1.setAge(32);
		c1.setComp("Google");
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getComp());
		
		//default const...
		Customer c2 = new Customer();
		c2.setName("Peter");
		c2.setAge(33);
		c2.setComp("Apple");
		
		System.out.println(c2.getName());
		System.out.println(c2.getAge());
		System.out.println(c2.getComp());
		
		
		
		
		
		
		
	}

}
