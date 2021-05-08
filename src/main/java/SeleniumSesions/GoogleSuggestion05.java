package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class GoogleSuggestion05 {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
         WebElement search=   driver.findElement(By.name("q"));
         search.sendKeys("naveen Automation labs");		
		Thread.sleep(3000);
		List<WebElement> suggestionlist =driver.findElements(By.xpath("//div[@class='sbl1']/span"));
			
		for( WebElement sugg: suggestionlist) {
			String sugglist = sugg.getText();
			System.out.println(sugglist);
			if(sugglist.equals("naveen automation labs youtube")) {
				sugg.click();
				break;
			}
		// home work autosuggestion: automationparactice.com
		// amazon same autosuggestion
		//selenium does not prvide direct method for that but cypress provide method for that
		// sealnium learning curve is good you have to learn
		// 1:00:00 what if select tag is not available 
		}	
		}
}
