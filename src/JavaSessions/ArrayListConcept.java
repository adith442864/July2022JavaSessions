package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList -> default class
		//need to create the object of AL using new keyword
		//it maintains the order/index
		//Default Virtual Capacity of ArrayList = 10 (Segments)
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100); //0
		ar.add(200); //1
		System.out.println(ar.size()); //pc = 2
		
		ar.add(300); //2
		ar.add(400); //3
		System.out.println(ar.size());
		
		ar.add(500); //4
		ar.add(600); //5
		ar.add(700); //6
		System.out.println(ar.size()); //7
		
		ar.add(12.33);
		ar.add("testing");
		ar.add('m');
		ar.add(true);
		ar.add(500); //duplicates are allowed...
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(6));
//		System.out.println(ar.get(7)); //java.lang.IndexOutOfBoundsException
//		System.out.println(ar.get(-1)); //java.lang.IndexOutOfBoundsException
		
//		ar.remove(5);
//		System.out.println(ar.get(5)); //700
//		System.out.println(ar.size());
		
		//to print all the values from AL: use for loop:
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("---------");
		
		//for each loop:
		
		
		
		
		
		

	}

}
