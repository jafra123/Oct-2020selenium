package SeleniumSesions;

import java.util.List;import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreamsWithFilters07 {
	// java 8 streams will be applied on List
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	//	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.amazon.in/");
		List<WebElement> checkbox = driver.findElements(By.tagName("a"));
	
//->		checkbox.stream().forEach(ele -> ele.click());
//->		checkbox.parallelStream().forEach(ele -> ele.click());
		
//      print the text of each link contains Amazon keyword
		// this alternate for loop some pepole use that some not
		// you can alos use for loop or for weach loop
		/*List<String> amazonlinklist = checkbox.stream()
						.filter(ele -> !ele.getText().equals("") && ele.getText()
								.contains("Amazon"))
						.map(ele -> ele.getText())
						.collect(Collectors.toList());   */
		 
		// improve like below 
		List<String> amazonlinklist = checkbox.stream()
				.filter(ele -> !ele.getText().isEmpty())
				.filter(ele -> ele.getText().contains("Amazon"))						
				.map(ele -> ele.getText())
				.collect(Collectors.toList());
		
		
		amazonlinklist.stream().forEach(ele -> System.out.println(ele));
		
		
	}

}
