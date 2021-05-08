package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	// all the browser relate dmethods

	/**
	 * this method is used to initilize the webdriev on the basis of given browser
	 * name
	 * 
	 * @param browsername
	 * @return it returns WebDriver
	 */

	// Utitlity wedriver
	WebDriver driver; // we avoid static here because taht is not pure object oriented

	// browser name
	public WebDriver init_driver(String browserName) { // the type of driver is WebDriver
		// String browserName = "chrome";
		if (browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\manmo\\Desktop\\Naveen\\chromedriver.exe"); // WINDOW
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();// RHS // this will open the browser-> defauclt custrucot will be called
		} else if (browserName.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\manmo\\Desktop\\Naveen\\geckodriver.exe"); // WINDOW
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("safari")) {
			driver = new SafariDriver(); // safari driver dont need like System.setProperty("webdriver.gecko.driver",

		} else {
			System.out.println("please pass the correct browser");
		}
		return driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

}
