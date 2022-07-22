package OOP_Abstract;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.header();
		lp.url();
		lp.doLogin("admin", "admin");
		
		System.out.println("--------------");
		
		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.header();
		hp.doLogout();
		
//		Page p = new Page(); //Cannot instantiate the type Page
		
		//top casting:
		//child class object can be referred by parent abstract class ref variable
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		p.logo();
		//can not access doLogin method comes from child class (LoginPage)
		
		//down casting: CT Not allowed
//		LoginPage l1 = =new Page();
		
		

	}

}
