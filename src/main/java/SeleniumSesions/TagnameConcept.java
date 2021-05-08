package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagnameConcept {
	public static void main(String[] args) {		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		String header =driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		String h2 =driver.findElement(By.tagName("h2")).getText();  // getText() can be appliaed on any locatoor, like xpath, i d
		System.out.println(h2);
	   
	
	
	
	
	}

}
