package JavaSessions;

import java.util.ArrayList;

public class Customer {
	
	public ArrayList<String> doSearch(String categoryName) {
		System.out.println("Searching the product: " +categoryName);
		ArrayList<String> prodList = new ArrayList<String>();
		
		switch (categoryName) {
		case "Apple":
			prodList.add("iphone12");
			prodList.add("macbook pro");
			prodList.add("ipad mini");
			break;
			
		case "Samsung":
			prodList.add("s8");
			prodList.add("samsung tablet");	
			break;
			
		case "HP":
			prodList.add("hp headphone");
			prodList.add("hp laptop");	
			break;

		default:
			System.out.println("product category is not found..." +categoryName);
			break;
		}
		
		return prodList;
		
	}
	
	// WAF - launch the browser  (Cross Browser logic)
	// input parameter: browserName (String)
	// return: void
	//limit parameters (255 parameters can be passed)

	
	public void launchBrowser(String browserName) {
		System.out.println("browser name is :" +browserName);
		switch (browserName) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "edge":
			System.out.println("launch edge");
			break;

		default:
			System.out.println("please pass the right browser :" +browserName);
			break;
		}
		
	}
	
	//WAF: Register a user:
		//params: fn, ln, email, ph, password, age, dob, city, address, country
		// we will pass the class object -- encapsulation
	public void register(String fn, String ln, String email, String ph) {
		
	}

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		ArrayList<String> appleList = c1.doSearch("Apple");
		System.out.println(appleList.size());
		System.out.println(appleList);
		
		ArrayList<String> samsungList = c1.doSearch("Samsung");
		System.out.println(samsungList.size());
		System.out.println(samsungList);
		
		//for each loop:
		for(String e: samsungList) {
			System.out.println(e);
		}
		
		ArrayList<String> nokiaList = c1.doSearch("Nokia");
		System.out.println(nokiaList.size()); //0
		System.out.println(nokiaList); // []
		
		c1.launchBrowser("firefox");
		
		
	}

}
