package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetMenu06 {
		
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
			driver.get("https://www.spicejet.com/");			
		//	By addonsLink = By.xpath("//a[@id='highlight-addons']");
			By addonsLink = By.linkText("ADD-ONS"); // selenium loook for what is visible notit the dom
			By TravelInsurance =  By.xpath("//a[text()='Travel Insurance']");
			By subMenuStudentDis = By.xpath("//a[text()='Visa Services']");		
			
			ElementUtil util = new ElementUtil(driver);
			util.clickOnSubmenu(addonsLink, TravelInsurance);	
			//util.clickOnSubmenu(addonsLink, subMenuStudentDis);	
		  // see just need to collect by locator and util method how easy 

	}

}
