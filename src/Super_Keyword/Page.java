package Super_Keyword;

public class Page {
	
	public Page() {
		System.out.println("Page -- default const..");
		
	}
	

	public Page(int a) {
		System.out.println("Page -- const.." +a);
		
	}
	
	public Page(int a, int b) {
		System.out.println("Page -- const.." +(a+b));
		
	}
	
	
	int timeOut = 100;
	
	public void display() {
		System.out.println("Page display");
	}

}
