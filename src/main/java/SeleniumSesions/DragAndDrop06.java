package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop06 {	
		
		static WebDriver driver;
		public static void main(String[] args) {			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			//Actions action = new Actions(driver);
		   // Select selec = new Select(driver.findElement(By.xpath("")));
						//By srcElement1= By.id("draggable");
			//By TargteElement =By.id("droppable");
			
			WebElement srcElement= driver.findElement(By.id("draggable"));
			WebElement TargteElement =driver.findElement(By.id("droppable"));	
			
			//action.clickAndHold(srcElement).dragAndDrop(srcElement, TargteElement).build().perform();
			WebElement a = (WebElement) driver.findElements(By.tagName("iframe"));
			System.out.println(a);
			/*action
			.clickAndHold(srcElement).
			moveToElement(TargteElement).
			release().
			build().
			perform(); */
			//  needed -----build().perform();	
			
			//class= demo-frame
			//iframe
			
		

	}

}
