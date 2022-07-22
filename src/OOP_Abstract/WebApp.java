package OOP_Abstract;

public abstract class WebApp {
	
	//0% abstraction --> no abstract methods..
	//100% abstraction --> only abstract methods
	//0-100% partial astraction - can have abs.. methods + non abs.. methods
	
	public void url() {
		System.out.println("WebApp - url");
	}
	
	public void title() {
		System.out.println("WebApp -- title");
	}
	
	public abstract void header();
	public abstract void footer();
	
}
