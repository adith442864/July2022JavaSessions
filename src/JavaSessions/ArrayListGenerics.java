package JavaSessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		//int AL:
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		//for each loop:
		for(Integer e: ar) {
			System.out.println(e);
		}
		
		System.out.println("--------");
		
		for(int e: ar) {
			System.out.println(e);
		}
		
		//double AL:
		ArrayList<Double> ar1 = new ArrayList<Double>();
		ar1.add(12.33);
//		ar1.add(100); //not applicable for argument integer
		ar1.add(10.0);
		
		System.out.println("--------");

		for(double e: ar1) {
			System.out.println(e);
		}
		
		System.out.println("--------");
		//String AL:
		ArrayList<String> prodList = new ArrayList<String>();
		prodList.add("Apple");
		prodList.add("Samsung");
		prodList.add("Nokia");
		
		//prodList.add(100); //ArrayList<String> is not applicable for the arguments (int)
		
		for(String e: prodList) {
			System.out.println(e);
		}
		
		//Object data AL:
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Dhara");
		empData.add(25);
		empData.add('f');
		empData.add(1000.323);
		empData.add(true);
		
		System.out.println("--------");
		System.out.println(empData.size());
		
		for(Object e: empData) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
