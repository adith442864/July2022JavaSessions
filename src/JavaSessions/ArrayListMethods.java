package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer> (Arrays.asList(10,20,30,40,50));
		System.out.println(numbers);
		
		//static method:
		int i[] = {10,20,30,40,50}; //Array literals
		System.out.println(Arrays.toString(i));
		
		ArrayList<String> names = new ArrayList<String> (Arrays.asList("JAVA","Python","JS"));
		System.out.println(names);
		
		ArrayList<String> l1 = new ArrayList<String> (Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<String> (Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3 = new ArrayList<String> (Arrays.asList("B","A","C","D","F"));
		
		System.out.println(l1.equals(l3));
		
		System.out.println(l3);
		Collections.sort(l3);
		System.out.println(l3);
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		
		if(l1.equals(l3)) {
			System.out.println("PASS");
		}
		
		//web page -> drop down -> 5 elements -- actlist 
		//explist --> 5 elements 
		
		ArrayList<String> l4 = new ArrayList<String> (Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l5 = new ArrayList<String> (Arrays.asList("A","B","C","D","E"));
		
		//l4.removeAll(l5);
		//System.out.println(l4); //[F] --> additional element
		
		l5.removeAll(l4);
		System.out.println(l5); //[E]
		
		//find out the common elements between two array list:
		ArrayList<String> lang1 = new ArrayList<String> (Arrays.asList("JAVA","Python","JS","DS","Algo"));
		ArrayList<String> lang2 = new ArrayList<String> (Arrays.asList("JAVA","Python","JS","DS","PHP"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		//addAll()
		ArrayList<String> l6 = new ArrayList<String> (Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l7 = new ArrayList<String> (Arrays.asList("P","Q","R"));
		
		l6.addAll(l7);
		System.out.println(l6); //[A, B, C, D, F, P, Q, R]
		System.out.println(l7); //[P, Q, R]
		
		//clear()
		//l7.clear();
		//System.out.println(l7); //[]
		
		ArrayList<String> cloneList = (ArrayList<String>)l7.clone();
		System.out.println(cloneList);//[P, Q, R]
		
		
		ArrayList<String> l8 = new ArrayList<String> (Arrays.asList("A","B","C","D","F"));
//		l8.add(0, "T");
//		System.out.println(l8); //[T, A, B, C, D, F]

		l8.add(9,"N");
		System.out.println(l8);//[A, B, C, D, F, N]
		
		
		
		
		
		
	}

}
