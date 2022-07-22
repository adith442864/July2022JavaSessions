package OOP_Abstract;

public class LoginPage extends Page {
	
	//at run time, default const will be created... --> hidden const...by Java
	public LoginPage() {
		System.out.println("LP -- default const.....");
	}

	@Override
	public void title() {
		System.out.println("LP - title");
	}

	@Override
	public void url() {
		System.out.println("LP - url");
		
	}
	
	@Override
	public void header() {
		System.out.println("LP -- header");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("Login with : "+un +": "+pwd);
	}
	

	public void doLogin(String un, String pwd, long ph) {
		System.out.println("Login with : "+un +": "+pwd+" "+ph);
	}
	
}
