package JavaSessions;

public class Customers {
	
	String name;
	int id;
	static String city = "Bangalore";
	static String paymentMethod = "CC";
	
	
	public void getInfo() {
		System.out.println("get info....");
	}
	
	public static void sendMail() {
		System.out.println("send mail method.....");
	}

	public static void main(String[] args) {
		
		Customers obj = new Customers(); 
		
		//how to call static methods:(parallel execution is not allowed..)
		//1. call directly
		sendMail();
		obj.getInfo();
		
		//2. call them by the class name:
		Customers.sendMail();
		
		
		//3. call them by using object reference:
		obj.sendMail();
		obj.getInfo();

	}

}
