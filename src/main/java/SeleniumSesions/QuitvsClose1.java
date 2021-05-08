package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsClose1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manmo\\Desktop\\Naveen\\chromedriver.exe"); // WINDOW
		WebDriver driver = new ChromeDriver();// RHS // this will open the browser-> defauclt custrucot will be called		
		driver.get("https://www.google.com/"); 
		// www.google.com/  - will taht work    - have to write https://		
		//	driver.manage().window().fullscreen();
		String title = driver.getTitle();
		System.out.println(title);		
		driver.close();
		//driver.quit();
		String title1 = driver.getTitle();
		
	}

}
