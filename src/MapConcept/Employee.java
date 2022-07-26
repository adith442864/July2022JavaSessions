package MapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		
		//Map(I) --> HashMap(C)
		//HashMap does not maintain any index/order:
		HashMap<String,String> empMap = new HashMap<String, String>();
		empMap.put("A", "Tom");
		empMap.put("B", "Peter");
		empMap.put("C", "Robert");
		
		System.out.println(empMap.get("A"));
		System.out.println(empMap.get("B"));
		
		HashMap<String,Integer> studentMap = new HashMap<String, Integer>();
		studentMap.put("Tom", 100);
		studentMap.put("Peter", 80);
		studentMap.put("Peter", 300); //latest value
		studentMap.put("Ricky", 40);
		studentMap.put("Naveen", 300);
		studentMap.put(null, 400);
		studentMap.put(null, 500); //latest value will be considered...
		
		System.out.println(studentMap.get("Peter"));
		System.out.println(studentMap.get(null));
		
		System.out.println("------------------------");
		
		studentMap.forEach((k,v) -> System.out.println(k + ":" +v));
		
		System.out.println("----------------------");
		
		HashMap<Integer,Integer> hm1 = new HashMap<Integer, Integer>();
		hm1.put(1, 100);
		hm1.put(2, 300);
		
		HashMap<Integer,String> userMap = new HashMap<Integer, String>();
		userMap.put(101,"Tom");
		
		System.out.println(userMap.get(101));
		
		//traverse:
		
		
		
		
		
		

	}

}
