package ConstructorConcept;

public class RegistrationPage {
	
	private String firstName;
	private String lastName;
	private String eMail;
	private int telePhone;
	private String Password;
	private String PasswordConfirm;
	
	public RegistrationPage() {
		System.out.println("default const...");
	}
	
	public RegistrationPage(String firstName, String lastName, String eMail, int telePhone, String password,
			String passwordConfirm) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.telePhone = telePhone;
		Password = password;
		PasswordConfirm = passwordConfirm;
	}
	
	//getter and setters:

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getTelePhone() {
		return telePhone;
	}

	public void setTelePhone(int telePhone) {
		this.telePhone = telePhone;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPasswordConfirm() {
		return PasswordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		PasswordConfirm = passwordConfirm;
	}
	
	
	
	
	
	
	
	

}
