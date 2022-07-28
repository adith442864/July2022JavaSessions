package JavaSessions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAndHashTable {

	public static void main(String[] args) {
		
		//HashMap<String, String> userMap = new HashMap<String, String>();
		Map<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "Bangalore");
		userMap.put(null, "pune");
		userMap.put(null, "hyderabad");
		userMap.put("company", null);
		userMap.put("country", null);
		
		//System.out.println(userMap.get("id"));
		//System.out.println(userMap.get("0"));
		
		System.out.println(userMap.size());
		
		//print all the values:
		for(Entry m: userMap.entrySet()) {
			System.out.println(m.getKey() +" : " +m.getValue());
		}
		
		//Hashtable:
		
		Hashtable<String, Integer> prodTable = new Hashtable<String, Integer>();
		prodTable.put("Apple Macbook", 2000);
		prodTable.put("Win HP Laptop", 1000);
		prodTable.put("Apple iphoneX", 1500);
//		prodTable.put(null, 1500); //NPE
//		prodTable.put("Dell Laptop", null); //NPE
		
		System.out.println(prodTable);
		
		for(Entry m : prodTable.entrySet()) {
			System.out.println(m.getKey() +" : " +m.getValue());
		}
		
		
		
		//differences:
		//hashmap : is non synchronized -- not thread safe...
			//concurrent hashmap is synchronized hashmap -> post JDK 1.7 
		// only one null key, multiple null values are allowed in Hashmap
		
		//hashtable:
			//is synchronized and multiple threads can't be allowed to fetch/write the data
			// no  null key and values allowed.
		
		

	}

}
