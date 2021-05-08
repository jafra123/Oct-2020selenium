package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams07 {
	// java 8 streams will be applied on List
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.amazon.in/");
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		
		long sttime = System.currentTimeMillis();
		// stream   - > Slower than parallelStream
	//	linkslist.stream().forEach(ele -> System.out.println(ele.getText())); // Lambda expressions are allowed only at
																				// source level 1.8 or above
		//long endtime = System.currentTimeMillis();
      // System.out.println("time taken"+ (endtime-sttime)); 
		// parallelStream is faster
		 linkslist.parallelStream().forEach(ele -> System.out.println(ele.getText()));
		long endtime = System.currentTimeMillis();
       System.out.println("time taken"+ (endtime-sttime)); 
       //6574
     //   6304 ------> // parallelStream is faster
	}

}
