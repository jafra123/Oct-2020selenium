package SeleniumSesions;

import java.util.List;import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCheckboxwithStreams07 {
	// java 8 streams will be applied on List
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.amazon.in/");
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		
		/*collectlist = linkslist.stream()
				.filter(ele -> !ele.getText().equals(""))
				.map(ele -> ele.getText())
				.collect(Collectors.toList()); */			
		List<String> collectlist = linkslist.stream()
				.filter(ele -> !ele.getText().equals(""))
				.map(ele -> ele.getText())
				.collect(Collectors.toList());
		
		collectlist.stream().forEach(ele -> System.out.println(ele));
		
		
	}

}
