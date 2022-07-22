package OOP_Abstract;

public abstract class Page {
	
	//abstract class object can not be created
	//but abstract class constrcutor can be created
	//it will be called when we create the object of the child class
	

	
	public Page() {
		System.out.println("Page -- default const...");
	}
	
	public Page(int t) {
		System.out.println("Page -- one param const..." +t);
	}
	
	public abstract void title();
	public abstract void url();
	
	public void header() {
		System.out.println("Page -- header");
	}
	
	public final void logo() {
		System.out.println("Page -- logo");
	}

}
