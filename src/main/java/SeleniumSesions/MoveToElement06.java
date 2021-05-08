package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement06 {
	static WebDriver driver;
	public static void main(String[] args) {		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		    WebElement ContextClick =driver.findElement(By.xpath("//span[text()='right click me']"));		    
		  //  ContextClick.
		  // u can not do context click directaly you nee action class for user action
		    Actions action = new Actions(driver);
		    action.contextClick(ContextClick).perform();     
		     
	}
}
