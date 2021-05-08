package TestNgSessions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoonTest extends BaseTest {
    /* WebDriver driver     
      @BeforeTest     // this will executed before @test
	  public void setup() {
    	 WebDriverManager.chromedriver().setup();
    	 driver= new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().deleteAllCookies();
    	 driver.get("https://www.noon.com/uae-en/");
		//System.out.println("");
	  
      }    */ 
      // 3 test how many times browser will launch ?
     @Test (priority=1)
     public void flipcartTitleTest() {    // use test at the end 
    	 driver.get("https://www.noon.com/uae-en/");
    	String title =  driver.getTitle();
    	 System.out.println("page titile is " + title);
    	 Assert.assertTrue(title.contains("Online Shopping"));
     }     
     
     @Test (priority=2)
     public void noonLogoTest() {    // use test at the end 
       /* -4
        * boolean flag =  driver.findElement(By.xpath("//img[@class='_2xm1JU']")).isDisplayed();
    	//Assert.assertEquals(actual, expected);
    	Assert.assertTrue(flag);   // tesng say give me true value i will validate 
    	*/    	 
    	 // instead 4 use this code 
    Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='noon']")).isDisplayed());    	
     }     
     @Test (priority=3)
     public void noonloginButtonTest() {     
     Assert.assertTrue(driver.findElement(By.xpath("//span[@id='dd_header_signInOrUp']")).isDisplayed());
    
     }      
     
     
     
     
    /* 
     @AfterTest
     public void tearDown() {
    	 driver.quit();
     } */
	
}
