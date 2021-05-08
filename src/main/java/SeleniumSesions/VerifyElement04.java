package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement04 {		
		static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/login");	
			By password= By.linkText("Forgotten Password");
			By continue1 = By.linkText("Continue");			 
		/*	 create a generaic metod for blwo codes 
		  List<WebElement> eleList=driver.findElements(By.linkText("Forgotten Password"));
		  System.out.println(eleList.size());// count is 2		  
		  if(eleList.size()>0) {
			  System.out.println("element is found");
		  }
		  else
		  {
			  System.out.println("element is not found");
		  }
       		generaic metod above     */	
			
			System.out.println(checkElementisPresent(password));
			System.out.println(checkElementisPresent(continue1));
			
	}	
		//same like is displayed but here different statergy, isdisplayed only for 1 element	
		public static boolean checkElementisPresent(By locator) {
			 List<WebElement> eleList=driver.findElements(locator);
			//  System.out.println(eleList.size());// count is 2		  
			  if(eleList.size()>0) {
				 return true;
			  }
			  else
			  {
				return false;
			  }
		}
		
}
