package BuilderPattern;

public class EcommApp {
	
	public EcommApp login() {
		System.out.println("default login");
		return this;
	}
	
	public EcommApp login(String un, String pwd) {
		System.out.println("login with:" +un+":"+pwd);
		return this;
	}
	
	public EcommApp search() {
		System.out.println("default search");
		return this;
	}
	
	public EcommApp search(String prodName) {
		System.out.println("search for :" +prodName);
		return this;
	}
	
	public EcommApp search(String prodName, int rating) {
		System.out.println("search for :" +prodName+":" +rating);
		return this;
	}
	
	public EcommApp addToCart(String prodName) {
		System.out.println("add to cart: " +prodName);
		return this;
	}
	
	public EcommApp doPayment(String upi) {
		System.out.println("do pay via:" +upi);
		return this;
	}
	
	public EcommApp doPayment(String CC, int cvv) {
		System.out.println("do pay via:" +CC +":" +cvv);
		return this;
	}
	
	public EcommApp doPayment(String CC, int cvv, int otp) {
		System.out.println("do pay via:" +CC +":" +cvv+":" +otp);
		return this;
	}
	
	public EcommApp generateOrderId() {
		System.out.println("order id is :" +1223);
		return this;
	}
	
	public EcommApp logout() {
		System.out.println("App logout.....");
		return this;
	}

}
