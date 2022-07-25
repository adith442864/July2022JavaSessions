package Super_Keyword;

public class LoginPage extends Page {
	
	int timeOut = 200;
	
	public LoginPage() {
		// you can not have two super() keyword inside child constructor...
		// super() should be the first statement inside constructor...
		super(10,20);
		System.out.println("LP -- default const...");
	}
	
//	public LoginPage(int a) {
//		super(a);
//		System.out.println("LP -- const..." +a);
//	}
//	
//	public LoginPage(int a, int b) {
//		super(a, b);
//		System.out.println("LP -- const..."+(a+b));
//	}
//	
	public void loginInfo() {
		System.out.println("login info method...");
		super.display(); //parent 
		display(); //child
	}
	
	@Override
	public void display() {
		System.out.println("Login Page display");
		super.display();
		
	}

	
	public void getTimeOut() {
		System.out.println(timeOut);
		System.out.println(super.timeOut);
		
	}
	
	

}
