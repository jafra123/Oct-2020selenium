package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEmoShopLinks04 {
     
		static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/register");
			By link = By.xpath("//div[@class='list-group']/a");			
			ElementUtil util = new ElementUtil(driver);
			util.clickElement(link, "Forgotten Password");
			
		// Assig- google page footer get the text of footer links
			// capture the text of footer links on google
			// fresh work .com print all the links
			
			
			

	}

}
