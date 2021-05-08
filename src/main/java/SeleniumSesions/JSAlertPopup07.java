package SeleniumSesions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertPopup07 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		By signinbutton = By.name("proceed");
		driver.findElement(signinbutton).click();
		Alert alert = driver.switchTo().alert(); // only work with java script pop up
		String text = alert.getText();
		System.out.println(text);
		alert.accept(); // accept
		// alert.dismiss(); // if press Esc on keyboard
		// after alert.accept(); you driver will be lost so yuo have to write below
		// command , some time
		// works without it
		driver.switchTo().defaultContent();  // some time yuo have to use theat so taht driver dont get lost
		driver.findElement(By.id("login1")).sendKeys("hello");
		
		
		
		

	}

}
