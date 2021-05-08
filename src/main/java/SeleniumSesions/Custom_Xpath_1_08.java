package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_1_08 {		
		static WebDriver driver; 		
	    public static void main(String[] args) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			//https://www.hubspot.com/
			
//	xpath: is a locator 
			// 2 types of xpath 
			// absolute : from paretnt to child -> Risky xpath
			// relative xpath: xpath functions, attribute 
			// htmltag[@attr ='value']
			// input [@id ='usrname']
			// input[@type='email'
			// htmltag[@attr ='value'and @attr2 = 'value']
			// input[@id='username' and @type='email' and @name ='name1']
			// //input[@id and @type]
			//input
			//a
			// contains();
			// dynamic id:
			// <input "id" = "test123">       // id is changind we have to use contains functions
			// <input "id" = "test133">
			// <input "id" = "test444">
			
		   //tag[contains(@att, 'value')]
			//input[contains(@id,'username')]
			
		//https://www.kayak.com/flights         - Id is everithime different - can not use id 
			//id = c3ikf-origin-airport           -refresh the page 
			// id = x8YD-origin-airport
			// id = b-ZX-origin-airport
			
			//input[contains(@id,'-origin-airport')] - if the id is dynamic than use xpath
			//input[contains(@id,'username')]
			//input[contains(@id,'username') and @type='email']
			//input[contains(@id,'username') and contains(@type,'email')]
			
			// contains with text();
			//h3[contains(text(),'Companies & Contacts')]
			//h3[contains(text(),'Companies')]
			// where ever contains dont use = 
			//h3[contains(text(),'Contact Management')]
			
			// starts-with():
			//h3[starts-with(text(),'Contact')]              -- with text()
			//input[starts-with(@name,'username')]            -- @ attribute

			// parent - child
			//ul[@class='nav navbar-nav navbar-right']/li/a 
			// https://www.freshworks.com/
			
			//ul[@class='footer-nav']/li/a
			// but when u use xpath 
			
			By ele = By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a "); //- right 
			By ele1 = By.className("nav navbar-nav navbar-right"); // -- wrong - need to find the unique 
			
		

	}

}
