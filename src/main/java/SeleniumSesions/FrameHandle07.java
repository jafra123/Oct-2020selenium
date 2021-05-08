package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle07 {
		static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://www.londonfreelance.org/courses/frames/");
			// ************** 1- way 
			//driver.switchTo().frame(2);                  // frame is oveloaded method
			// ************ 2nd way 
			//driver.switchTo().frame("main");    // dont use index use name or id 
			// **********3rd way --  Select a frame using its previously located WebElement.
			driver.switchTo().frame(driver.findElement(By.name("main")));
			
			// frame and iframe same 
			WebElement a = driver.findElement(By.xpath("//h2"));			
			System.out.println(a.getText());
		
			driver.switchTo().defaultContent(); // come back and continue yuo work 
			
			
			
			
			

	}

}
