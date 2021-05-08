package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		// type="file" should be there - than the below code works 
		// if not you can ask the develper to make type = "file"  its ablocker for my automation
		driver.findElement(By.name("upfile")).sendKeys("C:/Users/manmo/Desktop/Selenium/Selenium.txt");

	}
}
