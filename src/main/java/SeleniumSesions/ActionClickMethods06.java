package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickMethods06 {
	static WebDriver driver;
	public static void main(String[] args) {		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.get("https://demo.opencart.com/index.php?route=account/login"); 		 
	         By email = By.id("input-email");
	         By password = By.id("input-password");
	         By loginButton =  By.xpath("//input[@value='Login']");
	        /* Create generic method for below code
	         Actions action = new Actions(driver);   
	         action.sendKeys(driver.findElement(email), "manlhan").perform();;
	         action.sendKeys(driver.findElement(password), "singh").perform();;
	         action.click(driver.findElement(loginButton)).perform();
	*/
	         doActionSendKeysl(email, "jugnu");
	         doActionSendKeysl(password, "jugnu");
	       //  doActionClick(loginButton);
	}

	public static   WebElement getElement (By locator) {
		return driver.findElement(locator);
	}
	
	// which one you prefer - i will prefer action class send click and send keys 40:00 good explanton
	// use action class element not intercatab le
	// 3r way to clikc is java script executor 
	public static void doActionSendKeysl(By locator, String email1 ) {
	Actions action = new Actions(driver);  
	action.sendKeys(getElement(locator), email1).perform();
	//action.sendKeys(getElement(locator), pass).perform();   
 //   action.click(driver.findElement(loginButton)).perform();
	
     }
	public static void doActionClick(By locator) {
		Actions action = new Actions(driver);  
		action.click(getElement(locator)).perform();
	}
/*
	
	public  static void doActionSendKeysl(By locator, String values ) {
		Actions action = new Actions(driver);  
//		action.sendKeys(getElement(locator), email1).perform();  less power below more power full becuase it more to elelemtn fist 
		action.moveToElement(getElement(locator)).sendKeys(values).build().perform();   // more powerfull way 
		//action.sendKeys(getElement(locator), pass).perform();   
	 //   action.click(driver.findElement(loginButton)).perform();
		
	     }
		public  static void doActionClick(By locator) {
			Actions action = new Actions(driver);  
			//action.click(getElement(locator)).perform();
			action.moveToElement(getElement(locator)).click().build().perform(); // more powerfull
		}
	
	*/
	
	
	

}

