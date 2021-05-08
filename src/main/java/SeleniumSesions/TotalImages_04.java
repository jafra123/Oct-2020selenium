package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages_04 {
		// total number of images		
		static WebDriver driver;
		public static void main(String[] args) {	
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");			
		List<WebElement> imageList =	driver.findElements(By.tagName("img"));
		System.out.println(imageList.size());		
		
		for(WebElement i: imageList) {
			String imag =i.getAttribute("src");  // for earch loop we dont do thi like regular for loop i(0)
			String text =i.getText();
			System.out.println("text"+ text+ "->" +imag );
		  // if(!text.isEmpty()) {			 
			//	System.out.println(text);
		  // }		
		}	
	}

}
