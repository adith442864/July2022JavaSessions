package BuilderPattern;

public class TestAmazon {

	public static void main(String[] args) {
		
		EcommApp user  = new EcommApp();
		//Builder Pattern -- Use case1
		user.login("admin@gmail.com","admin123")
			.search("Macbook")
				.addToCart("Macbook")
					.doPayment("1234 5678 9012 3456", 012)
						.generateOrderId()
							.logout();
		//Use Case2:
		user.login("admin@gmail.com","admin123")
			.addToCart("Macbook pro")
				.doPayment("test@okicici")
					.generateOrderId()
						.logout();
		
		//Use case3:
		user.login()
			.addToCart("Puma shoes")
				.logout();
		
		//Use Case4:
		user.login("test123", "test123")
			.search("GYM Equp", 5)
				.logout();
		
		//UC5:
			user.login("dhara@gmail.com", "dhar345")
				.logout();
			
		
		
		
		
		
	}

}
