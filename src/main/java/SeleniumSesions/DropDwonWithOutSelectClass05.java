package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDwonWithOutSelectClass05 {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		By country = By.xpath("//select[@id='Form_submitForm_Country']/option");	
		
		// dont use the select class
		// select tag use
		// and select the value from drop down
		// we can use xpath---> we will get alll the option and store into list
		/*
		List<WebElement> induslist = driver.findElements(industry);
		System.out.println(induslist.size());
		// for( String e: induslist) { // if STring thn use string
		for (WebElement e : induslist) {
			String text =e.getText();
			System.out.println(text);	
			
		}*/

		SelectDropDownFromListWitoutSelectClass(industry, "Education");
		
	}
	
	public static void SelectDropDownFromListWitoutSelectClass(By locator, String value) {
		List<WebElement> induslist = driver.findElements(locator);
	//	System.out.println(induslist.size());
		// for( String e: induslist) { // if STring thn use string
		for (WebElement e : induslist) {
			String text =e.getText();			
			if(text.equals(value)) {
				e.click();
				break;
			//System.out.println(text);
			
			}
		}
	
	}
	
	
	
	
}
