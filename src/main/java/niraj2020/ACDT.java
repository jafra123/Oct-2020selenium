package niraj2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACDT {	
		// java 8 streams will be applied on List
		static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		//	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.get("https://portal.acdt.edu.gh/admissions/#/home");
			driver.findElement(By.xpath("//a[text()='Start Application']")).click();
			driver.findElement(By.name("firstName")).sendKeys("man");
			driver.findElement(By.name("middleName")).sendKeys("man");
			driver.findElement(By.name("lastName")).sendKeys("man");
			driver.findElement(By.name("email")).sendKeys("man");
			driver.findElement(By.name("password")).sendKeys("man");
			driver.findElement(By.name("confirmPassword")).sendKeys("man");
			driver.findElement(By.id("recaptcha-anchor")).click();
			driver.findElement(By.id("Start Application")).click();
		
	}

}
