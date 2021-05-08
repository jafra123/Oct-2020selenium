package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class GoogleTestBeforeMethod extends BaseTest {
   /*  WebDriver driver;     
      @BeforeTest     // this will executed before @test
	  public void setup() {
    	 WebDriverManager.chromedriver().setup();
    	 driver= new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().deleteAllCookies();
    	 driver.get("https://www.google.com/");
		//System.out.println("");
	   }	 */     
      // 3 test how many times browser will launch ?
     @Test (priority =1)
     public void googleTitleTest() {    // use test at the end 
    	 driver.get("https://www.google.com/");
    	String title =  driver.getTitle();
    	 System.out.println("page titile is " + title);
    	 Assert.assertEquals(title, "Google");
     }    
     @Test (priority =2)
     public void googleLogoTest() {    // use test at the end 
       /* -4
        * boolean flag =  driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
    	//Assert.assertEquals(actual, expected);
    	Assert.assertTrue(flag);   // tesng say give me true value i will validate 
    	*/
    	 
    	 // instead 4 use this code 
    	Assert.assertTrue(driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed());
    	
     }     
     @Test (priority =3)
     public void googlrSearchButtonTest() {     
     Assert.assertTrue(driver.findElement(By.name("btnK")).isDisplayed());
     }     
     
    /* @AfterTest
     public void tearDown() {
    	 driver.quit();
     } */
	}
