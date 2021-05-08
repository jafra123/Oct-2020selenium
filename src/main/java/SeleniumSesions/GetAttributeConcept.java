package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {
    static WebDriver driver; 
	
    public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	//	String fn =driver.findElement(By.id("Form_submitForm_FirstName")).getAttribute("name");
		By firstname = By.id("Form_submitForm_FirstName");
		String nameAttr = doGetAttribute(firstname ,"name");
		System.out.println(nameAttr);
		

	}
	
	public static WebElement  getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String  doGetAttribute(By locator, String attributename) {
		return driver.findElement(locator).getAttribute(attributename);
	}
	
	
	
	

}
