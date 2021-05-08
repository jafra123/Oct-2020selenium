package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
    /**
	*  ceate DB Connections  -  BS   -- very rare you have to do 
       ceate a test user DB   - BT
       launch Browser      -BC
          
          login to app   -BM 
          Amazon search   --@test
          logout  --AM
          
          login to app    -BM
          get the amazon ttle and verify     --@test
          logout     -AM
      
      close browser     --AC
      delete test user from DB   -AT
      disconnect data base	   --AS
	*/
	
	
	
	// test ng provide anotation 
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("ceate DB Connections");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("ceate a test user DB ");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("launch Browser");
	}
	
	@BeforeMethod    // before each method
	public void beforeMethos() {
		System.out.println("login to app");
	}
	
	
	@Test (priority =1 )    // execute in alphabetical order
	public void amazonTitleTest() {
		System.out.println(" get the amazon ttle and verify ");
	}
	
	@Test (priority =2 )
	public void amazonSearchTest() {
		System.out.println(" Amazon search ");
	}
	
	@Test (priority =3 )
	public void amazonFilterTest() {
		System.out.println(" Amazon Filter test ");
	}
	
	
	// when test cases are done 
	
	@AfterMethod    // after each method
	public void afterMethos() {
		System.out.println("logout");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("close browser");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("delete test user from DB");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("disconnect data base");
	}
	
}
