package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkVersion();
		checkOSVersion();
		checkEnoughRAM();
		System.out.println(" browser is launched ");
	}
	
	private void checkVersion() {
		System.out.println("check br version");
	}
	
	
	private void checkOSVersion() {
		System.out.println("check os version");
	}
	
	private void checkEnoughRAM() {
		System.out.println("checkEnoughRAM");
	}

}
