package TestNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestBeforeTest {
     WebDriver driver;     
      @BeforeMethod     //  now 3 times browser will launch
	  public void setup() {
    	 WebDriverManager.chromedriver().setup();
    	 driver= new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().deleteAllCookies();
    	 driver.get("https://www.google.com/");
		//System.out.println("");
	   }	
     
      // 3 test how many times browser will launch ?
     @Test
     public void googleTitleTest() {    // use test at the end 
    	String title =  driver.getTitle();
    	 System.out.println("page titile is " + title);
    	 Assert.assertEquals(title, "Google");
     }
     
     
     @Test
     public void googleLogoTest() {    // use test at the end 
       /* -4
        * boolean flag =  driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
    	//Assert.assertEquals(actual, expected);
    	Assert.assertTrue(flag);   // tesng say give me true value i will validate 
    	*/
    	 
    	 // instead 4 use this code 
    	Assert.assertTrue(driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed());
    	
     }     
     @Test
     public void googlrSearchButtonTest() {     
     Assert.assertTrue(driver.findElement(By.name("btnK")).isDisplayed());
     }     
     
     @AfterMethod
     public void tearDown() {
    	 driver.quit();
     }
	
}
