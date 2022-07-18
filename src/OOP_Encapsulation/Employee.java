package OOP_Encapsulation;

public class Employee {
	
	

	public static void main(String[] args) {
		
		Company c1 = new Company();
		c1.name="MS";
		c1.hq="HYD";
		
		c1.setSharePrice(1000);
		
		int p1 = c1.getSharePrice();
		System.out.println(p1);
		
		

	}

}
