package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp07 {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		// use below to put admin into username and admin into password
		// 		Selenium_07   - 30:21 mnts
		// login page is not evlopt , running appliacation running on cloud
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println("hello");
}
}

