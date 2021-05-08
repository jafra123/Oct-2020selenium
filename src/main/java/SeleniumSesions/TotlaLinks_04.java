package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotlaLinks_04 {
	  static WebDriver driver;
		public static void main(String[] args) {
			// total number of links on the page
			// yuo have to print tje teext of eah link with the idex and ignore the blank text
			// you have to print the href value (url) of each link( those links having text)
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");		
		    List<WebElement> a = driver.findElements(By.tagName("a")); // what type of list generic List<WebElement>  
		    // array list is interface which implements List- Why element stored in list because its dyanamic in nature today 200 link tommorow 250
		    System.out.println("Total links->"+a.size());
		   // System.out.println(a);	
		      for (int i=0 ; i< a.size(); i++ ) {
		    	//  System.out.println(a);
		    	  String text =a.get(i).getText();
		    	  String url =a.get(i).getAttribute("href");
		    	 // System.out.println(i+"->"+text );//+"->"+url);
		    	  
		    	  if(!text.isEmpty()) {   // only prints the one which have text no empty
		    		  System.out.println(i+"->"+text );//+"->"+url);
		    		   System.out.println(url);
		    	  }
		    	
		      }		
	}

}
