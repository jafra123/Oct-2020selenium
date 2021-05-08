package SeleniumSesions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHnadel05 {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		/*
		Select selectindus = new Select(driver.findElement(industry)); // Select class cusntructor say that 
		//there is no default cunstruot you have to pass 1 web element		
		//selectindus.selectByIndex(4); // which when you prefer I prefer by Visisble text because index migh change 
		//selectindus.selectByVisibleText("Education"); // i porefer this 
		//selectindus.selectByValue("health");
		Select selectcountry = new Select(driver.findElement(country)); 
		selectcountry.selectByIndex(1);
		
		// so what is the problem with this code - 2 times you creating 2 object
		// have to write a generic code 
	    */
	
		//doSelectByIndex(country, 10);
		//doSelectByVisibleText(country, "Dominica");
		
	   /* now cretae a generic method for tht 
		Select selectindus = new Select(driver.findElement(industry));	
		List<WebElement> indusList = selectindus.getOptions();   //20 minutes 
	    System.out.println("total indusrrty options:"+indusList.size() );  
	    for(WebElement e : indusList ) {   // if DDTring string if WebElement than webelement 
	    String text = e.getText();
	    System.out.println(text);
	    }*/ 
	
		List<String> countrylist =getDropDownOtionValue(country);
		System.out.println(countrylist.size());
		System.out.println(countrylist);
		if(countrylist.contains("India")) {
			System.out.println("PASS");
		}
	
	} 		
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}    
	public static void doSelectByIndex(By locator, int index) {		
    	Select select = new Select(getElement(locator));
    	select.selectByIndex(index);    	
    }
	public static void doSelectByVisibleText(By locator, String text) {		
    	Select select = new Select(getElement(locator));
    	select.selectByVisibleText(text);    	
    }
	public static void doselectByValue(By locator, String value) {		
    	Select select = new Select(getElement(locator));
    	select.selectByValue(value);  	
    }
	
	
	public static List<String> getDropDownOtionValue(By locator) {
		
		List<String> list = new ArrayList(); // why i am writing String because i want to stro string
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions(); // 20 minutes
		// System.out.println("total indusrrty options:"+optionList.size() );
		for (WebElement e : optionList) { // if DDTring string if WebElement than webelement
			String text = e.getText();
			// System.out.println(text); // istead of printing requrement is stor them into
			// list and return
			list.add(text);
		}
		return list;

	}	
	
	
	
}
