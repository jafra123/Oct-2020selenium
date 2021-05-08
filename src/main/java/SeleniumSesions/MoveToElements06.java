package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElements06 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
			driver.get("http://mrbool.com/");		   
			By parentMenu = By.className("menulink");
			By subMenuCourses = By.linkText("COURSES");
			
			ElementUtil util = new ElementUtil(driver);
		//	util.doMovetoElement(parentMenu);
			//Thread.sleep(3000);
			//util.doActionClick(subMenuCourses);
			
			util.clickOnSubmenu(parentMenu, subMenuCourses);
	}
}
