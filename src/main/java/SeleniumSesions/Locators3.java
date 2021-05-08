package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
	static WebDriver driver;

	public static void main(String[] args) {
		//System.out.println(System.getProperties());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manmo\\Desktop\\Naveen\\chromedriver.exe"); // WINDOW
		driver = new ChromeDriver();// RHS // this will open the browser-> defauclt custrucot will be called
		// driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By url = By.id("Form_submitForm_subdomain");
		By firstnmae = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submit = By.id("Form_submitForm_action_request");

		//getElement(url).sendKeys("abc");
		//getElement(firstnmae).sendKeys("abc123");
	    //getElement(lastname).sendKeys("abc3455");
		//getElement(submit).click(); // how to iprove here - > i can create generic function

		// maintain ur By locator and call respective method - this approach Best
		//-----------------5 th apraoach 
		doSendKeys(url, "testautomation");
		doSendKeys(firstnmae, "testing");
		doSendKeys(lastname, "automation");
	//	doClick(submit);
	}

	// ----------------4 way
	// only oce writing the find element commnds
	public static WebElement getElement(By locator) {
		// WebElement a =driver.findElement(locator);
		// return a;
		// -------------- or do below 1 statement
		return driver.findElement(locator);
	}
	//i can create generic function
	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
