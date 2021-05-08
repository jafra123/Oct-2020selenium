package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// open the browser :Chrome
		// 2 enter tje applcation
		// get the title of the page 
		//verify the ttile is correct or not 
		// close the browser		
		// Top Casting		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/manmo/Desktop/Naveen/chromedriver"); // MAC or linux machine
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manmo\\Desktop\\Naveen\\chromedriver.exe"); // WINDOW
		WebDriver driver = new ChromeDriver();// RHS // this will open the browser-> defauclt custrucot will be called		
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
