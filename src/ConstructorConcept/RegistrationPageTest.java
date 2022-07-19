package ConstructorConcept;

public class RegistrationPageTest {

	public static void main(String[] args) {
		
		//page class
		//private class vars: fn, ln, email, telephone, password, confirmpassword
		//const.. with all fields
		//getter and setter
		
		//test class:
		//create the object of page class
		//get the values using getter
		//update the values using setter
		//get the values using getter
		
		RegistrationPage registerPage = new RegistrationPage
				("tom", "peter", "tompeter@gmail.com", 990000000, "admin123", "admin123");
		
		System.out.println(registerPage.getFirstName());
		System.out.println(registerPage.getLastName());
		System.out.println(registerPage.getTelePhone());
		System.out.println(registerPage.geteMail());
		System.out.println(registerPage.getPassword());
		System.out.println(registerPage.getPasswordConfirm());
		
		registerPage.seteMail("tompeter123@gmail.com");
		registerPage.setTelePhone(919191919);
		registerPage.setPassword("admin234");
		
		System.out.println(registerPage.getFirstName());
		System.out.println(registerPage.getLastName());
		System.out.println(registerPage.getTelePhone());
		System.out.println(registerPage.geteMail());
		System.out.println(registerPage.getPassword());
		System.out.println(registerPage.getPasswordConfirm());
		
	}

}
