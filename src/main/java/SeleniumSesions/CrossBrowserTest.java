package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	static WebDriver driver;     // that why we are using TOP casting here 
	public static void main(String[] args) {
		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manmo\\Desktop\\Naveen\\chromedriver.exe"); // WINDOW
			driver = new ChromeDriver();// RHS // this will open the browser-> defauclt custrucot will be called
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\manmo\\Desktop\\Naveen\\geckodriver.exe"); // WINDOW
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();  // safari driver dont need like System.setProperty("webdriver.gecko.driver",

		}
		else
		{
			System.out.println("please pass the correct browser");
		}

		driver.get("https://www.google.com/");		
		
				//driver.manage().window().fullscreen();
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
