package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm04 {

	
		static WebDriver driver;
		public static void main(String[] args) {	
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/register");		
		     List<WebElement> textfieldlist = driver.findElements(By.className("form-control"));// yo can collect eleemtns with any stategy 
		    // this will find all the elements with class name and enter manmohan several times
		     for(int i=1; i < textfieldlist.size() ; i++) {
		    	 textfieldlist.get(i).sendKeys("manmohan");  
		     }
		  
		
	}

}
