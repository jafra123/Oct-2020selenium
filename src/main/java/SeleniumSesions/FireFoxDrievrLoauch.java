package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDrievrLoauch {

	public static void main(String[] args) {		
			
//System.setProperty("webdriver.chrome.driver", "C:/Users/manmo/Desktop/Naveen/chromedriver"); // MAC or linux machine
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\manmo\\Desktop\\Naveen\\geckodriver.exe"); // WINDOW
		
		
		WebDriver driver = new FirefoxDriver(); // RHS // this will open the browser-> defauclt custrucot will be called
		
		//FirefoxDriver driver = new FirefoxDriver();   // I can do that but if you want to run with defferent program what you do 
		
		driver.get("https://www.google.com/"); 
		// www.google.com/  - will taht work    - have to write https://		
		
				driver.manage().window().fullscreen();
				String title = driver.getTitle();
				System.out.println(title);		
				
				if(title.equals("Google")) {
					System.out.println("corrrect title");
				} else
				{
					System.out.println("not correct");
				}		
			//	System.out.println(driver.getPageSource());
				
			   }
	   

		}