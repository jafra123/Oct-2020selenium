package TestNgSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;     
    @BeforeTest     // this will executed before @test
	   public void setup() {
 	 WebDriverManager.chromedriver().setup();
 	 driver= new ChromeDriver();
 	 driver.manage().window().maximize();
 	 driver.manage().deleteAllCookies();
 	// driver.get("https://www.flipkart.com/");
		//System.out.println("");
	   }  
	
    @AfterTest
    public void tearDown() {
   	 driver.quit();
    } 
	
}
