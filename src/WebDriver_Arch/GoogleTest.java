package WebDriver_Arch;

public class GoogleTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//cross browser testing logic:
		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}else {
			System.out.println("please pass the right browser... ");
		}
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement();
		driver.findElements();
		
		driver.click();
		driver.sendKeys("naveen@gmail.com");
		driver.close();
		
		
	}

}
