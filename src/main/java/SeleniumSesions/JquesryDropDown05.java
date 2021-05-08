package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquesryDropDown05 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);

		By choice1 = By.xpath("//span[@class='comboTreeItemTitle']");
		/*
		 * List<WebElement> choicelist=
		 * driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']")); for(
		 * WebElement e: choicelist) { String text =e.getText();
		 * if(text.equals("choice 5")) { System.out.println(text); e.click(); break; } }
		 */
		// 1-> single selection is fine

		// selectChoicefromDropDown1(choice1, "choice 4");
		// 2- multi selection how to do
		// selectChoicefromDropDown(choice1, "choice 4");
		 selectChoicefromDropDown(choice1, "choice 4", "choice 5", "choice 6 2 3" );
		
		// 3- all selection: - if 50 choces are you goign to pass 50?-         
		selectChoicefromDropDown2(choice1, "ALL");

	}

	public static void selectChoicefromDropDown1(By locator, String value) {
		List<WebElement> choicelist = driver.findElements(locator);
		for (WebElement e : choicelist) {
			String text = e.getText();
			if (text.equals(value)) {
				System.out.println(text);
				e.click();
				break;
			}
		}
	}

//		public static  void  selectChoicefromDropDown(By locator, String value) {
	public static void selectChoicefromDropDown(By locator, String... value) {// String... is calle strign aray
		List<WebElement> choicelist = driver.findElements(locator);
		for (WebElement e : choicelist) {
			String text = e.getText();
			for (int i = 0; i < value.length; i++) {
				if (text.equals(value[i])) {
					System.out.println(text);
					e.click();
					break;
				}
			}
		}
	}
	
	/**
	 * This function handles three test cases: 1. Single selection 
	 * 2. Multi selection
	 * 3. All selection : Please pass "all/ALL/All"
	 * @param locator
	 * @param value
	 */
	public static void selectChoicefromDropDown2(By locator, String... value) {// String... is calle strign aray
		List<WebElement> choicelist = driver.findElements(locator);
		if (!value[0].equalsIgnoreCase("ALL")) {
			for (WebElement e : choicelist) {
				String text = e.getText();
				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						System.out.println(text);
						e.click();
						break;
					}
				}
			}
		} 
		//all selections
		else {
			try {
			for (WebElement e : choicelist) {
				e.click();
			}
		} catch(Exception e) {
			
		}
		}
	}

}
