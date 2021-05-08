package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed {
     static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		// By Locators, because they created with the help of By Class
		By url = By.id("Form_submitForm_subdomain");
		By firstnmae = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submit = By.id("Form_submitForm_action_request");
	//	System.out.println(driver.findElement(url).isDisplayed());
	//	System.out.println(driver.findElement(firstnmae).isDisplayed());
	//	System.out.println(driver.findElement(lastname).isDisplayed());
		
	if(doIsDisplayed(url)) {
    System.out.println("url filed is displayed ");
	} 
	else 
	{
		System.out.println("url is not displayed");
	}
	}
	
	public static WebElement  getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean  doIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	
	
	

}
