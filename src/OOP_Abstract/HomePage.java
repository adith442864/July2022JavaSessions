package OOP_Abstract;

public class HomePage extends Page{

	@Override
	public void title() {
		System.out.println("HP -- title");
		
	}

	@Override
	public void url() {
		System.out.println("HP -- url");
	}
	
	@Override
	public void header() {
		System.out.println("HP -- header");
	}
	
	public void doLogout() {
		System.out.println("user is logged out...");
	}

}
