package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguage04 {
	// in us it not going to work
	// google.co.in
	// 35 mints 04 class selenium
	// xpath("//div/hello]/a") - > fromthis particular xpath get all the a links

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");

		By link = By.tagName("a");

		/*
		 * List<WebElement> textfieldlist = driver.findElements(By.tagName("a"));// yo
		 * can collect eleemtns with any stategy // this will find all the elements with
		 * class name and enter manmohan several times for(int i=0; i <
		 * textfieldlist.size() ; i++) { String text =textfieldlist.get(i).getText();
		 * System.out.println(text); //textfieldlist.get(i).sendKeys("manmohan");
		 * //if(textfieldlist.get(i).getText().equals("Cameras")) { // where ever see
		 * Camera text click if(text.equals("Cameras")) { textfieldlist.get(i).click();
		 * break; }
		 * 
		 * }
		 */
		// -------> create the generaci method and use it
		clickElement(link, "Contact Us");
		getElements(link);
	
	}
	
	public static List<WebElement> getElements(By Locator) {	
		//List<WebElement> links = driver.findElements(Locator);
	  //  return links;	    
		return  driver.findElements(Locator);
	}
	
	public static void clickElement(By locator, String wheretoclick) {
		//List<WebElement> elelist = driver.findElements(locator);// yo can collect eleemtns with any stategy
		List<WebElement> elelist =getElements(locator) ;
		// this will find all the elements with class name and enter manmohan several
		// times
		for (int i = 0; i < elelist.size(); i++) {
			String text = elelist.get(i).getText();
			System.out.println(text);
			// textfieldlist.get(i).sendKeys("manmohan");
			// if(textfieldlist.get(i).getText().equals("Cameras")) { // where ever see
			// Camera text click
			if (text.equals(wheretoclick)) {
				elelist.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	

}
