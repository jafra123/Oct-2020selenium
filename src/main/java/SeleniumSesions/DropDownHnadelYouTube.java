package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHnadelYouTube {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(driver.getTitle());

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");

		// Select select1 = new Select(driver.findElement(country));
		// select1.selectByVisibleText("India");

		// Select select2 = new Select(driver.findElement(industry));
		// select1.selectByVisibleText("Education");

		// selectelement(driver.findElement(country), "India");
		// selectByVisibleTeext(country, "India");
		// selectByVisibleTeext(industry, "Education");

		/// DropDownHnadelYouTube dp = new DropDownHnadelYouTube();

		//selectDropDownValue(country, "India");
		//selectDropDownValue(country, "value", "India");
		selectDropDownValue(country, DropDown.INDEX.toString(), "5");
		selectDropDownValue(industry, DropDown.VISIBLETEXT.toString(), "Education");
		selectDropDownValue(country, DropDown.VALUE.toString(),"India");
	}

	// -- 1 - way one method by method overloadin
	public static void selectDropDownValue(By locator, int index) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectDropDownValue(By locator, String value) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	// naveen way 

	public static void selectDropDownValue(By locator, String type, String value) {
		WebElement element = driver.findElement(locator);
		Select select = new Select(element);

		switch (type) {
		case "value":
			select.selectByVisibleText(value);
			break;

		case "index":
			select.selectByIndex(Integer.parseInt(value));
			;
			break;

		case "visibleText":
			select.selectByVisibleText(value);
			break;

		default:
			System.out.println("please pass the correct selection criteria...");
			break;
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectelement(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	public static void selectByVisibleTeext(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static void selectDropDwonByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void selectDropDwonByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

}
