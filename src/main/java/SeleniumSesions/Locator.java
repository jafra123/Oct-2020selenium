package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.getProperties();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manmo\\Desktop\\Naveen\\chromedriver.exe"); // WINDOW
		 driver = new ChromeDriver();// RHS // this will open the browser-> defauclt custrucot will be called		
		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		//driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/&hubs_signup-cta=homepage-nav-login");
		//	driver.manage().window().fullscreen();
		// create a web element(by using some locator) - perform action on t(clikc send keys)
		// -> ---------------1 way 
		//driver.findElement(By.id("input-email")).sendKeys("manmohan@gmail.com"); ;   // id is static method , by is class
		//driver.findElement(By.id("input-password")).sendKeys("test123"); ;
		
		// -------------------2------------ way - approachWhich way you prefer - this way 
		//WebElement email =driver.findElement(By.id("input-email"));   // id is static method , by is class
		//WebElement password =driver.findElement(By.id("input-password"));
		
		//---------------------3- way By locatior   -m
		//https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/&hubs_signup-cta=homepage-nav-login
		//form-control private-form__control login-email      // find the unique only- do not use all the classes together, u can use all classes together only in xpath 
		//form-control private-form__control login-password m-bottom-3
		Thread.sleep(1000);
		driver.findElement(By.className("login-email"))
		.sendKeys("test123"); // unique class name
		driver.findElement(By.className("login-password"))
		.sendKeys("test123");// unique class name
		
		
		
		//*[@id="Form_submitForm_Email"]
		
		
		//https://www.orangehrm.com/orangehrm-30-day-trial/
		
		By emailid = By.id("input-email");
		By password1 =By.id("input-password");
		
		driver.findElement(emailid).sendKeys("manmohan@gmail.com");
		driver.findElement(password1).sendKeys("test123");
		
		// ----------------4 way 
		
		
		getElement(emailid).sendKeys("ada@");
		getElement(password1).sendKeys("test123");
		
		
		
	}
	
	
	// ----------------4 way 
	// only oce writing the find element commnds	
	 public static WebElement getElement(By locator) {
		// WebElement a =driver.findElement(locator);
		// return a; 
		 //-------------- or do below 1 statement
		 return driver.findElement(locator);
		
	 }	
		
		
}
		
