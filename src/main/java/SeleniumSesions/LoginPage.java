package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	// static WebDriver driver;
	public static void main(String[] args) {

		WebDriverFactory wf = new WebDriverFactory();
		WebDriver driver = wf.init_driver("chrome");
		wf.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(wf.getPageTitle());
		System.out.println(wf.getPageUrl());

		By url = By.id("Form_submitForm_subdomain");
		By firstnmae = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submit = By.id("Form_submitForm_action_request");
		// now i dont want to write this code below
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\manmo\\Desktop\\Naveen\\chromedriver.exe"); // WINDOW
		// WebDriver driver = new ChromeDriver();//
		// driver.get("https://demo.opencart.com/index.php?route=account/login");
		// driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		// -------

		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(url, "test1");
		eleutil.doSendKeys(firstnmae, "firstname");
		eleutil.doSendKeys(lastname, "lastname");

		wf.quitBrowser();

	}

}
