package SeleniumSesions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private  WebDriver driver;

	// all the loacator related methods
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	// ----------------4 way
	// only oce writing the find element commnds
	// public static WebElement getElement(By locator) { // remove static now
	public WebElement getElement(By locator) {
		// WebElement a =driver.findElement(locator);
		// return a;
		// -------------- or do below 1 statement
		return driver.findElement(locator);
	}

	// i can create generic function
	// public static void doClick(By locator) {
	public void doClick(By locator) {
		getElement(locator).click();
	}

	// public static void doSendKeys(By locator, String value) {// remove static now
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	//*************************Action Class , send keys and clikc *************8
	
	// which one you prefer - i will prefer action class send click and send keys 40:00 good explanton
	// use action class element not intercatab le
	// 3r way to clikc is java script executor 
	public  void doActionSendKeysl(By locator, String values ) {
	Actions action = new Actions(driver);  
//	action.sendKeys(getElement(locator), email1).perform();  less power below more power full becuase it more to elelemtn fist 
	action.moveToElement(getElement(locator)).sendKeys(values).build().perform();   // more powerfull way 
	//action.sendKeys(getElement(locator), pass).perform();   
 //   action.click(driver.findElement(loginButton)).perform();
	
     }
	public  void doActionClick(By locator) {
		Actions action = new Actions(driver);  
		action.click(getElement(locator)).perform();
		//action.moveToElement(getElement(locator)).click().build().perform(); // more powerfull
	}
	
	public  void doMovetoElement(By locator) {
		Actions action = new Actions(driver);  
		//action.click(getElement(locator)).perform();
		action.moveToElement(getElement(locator)).perform(); // more powerfull
	}
	
	public void clickOnSubmenu(By parentMenu, By firstsubmenu) throws InterruptedException {
		//Actions action = new Actions(driver);  
		doMovetoElement(parentMenu);
		//action.moveToElement(getElement(parentMenu));
		//Thread.sleep(3000);
		doActionClick(firstsubmenu);
	}
	public void clickOnSubmenu(By parentMenu, By firstsubmenu, By secondSubmenu) throws InterruptedException {
		//Actions action = new Actions(driver);  
		doMovetoElement(parentMenu);
		//action.moveToElement(getElement(parentMenu));
		Thread.sleep(3000);
		doActionClick(firstsubmenu);
		Thread.sleep(3000);
		doActionClick(secondSubmenu);		
	}
	
	
	
	//*************************Action Class , send keys and clikc
	
	
	
	
	
	
	

	public  String  doGettext(By locator) {
		return driver.findElement(locator).getText();
	}
	public  String  doGetAttribute(By locator, String attributename) {
		return driver.findElement(locator).getAttribute(attributename);
	}
	
	public  boolean  doIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();   
	}	
	
	public  boolean checkElementisPresent(By locator) {//same like is displayed but here different statergy, isdisplayed only for 1 element
		 //List<WebElement> eleList=driver.findElements(locator);
		// List<WebElement> eleList=getElements(locator) ;
		//  System.out.println(eleList.size());// count is 2  		 
		// if(eleList.size()>0) {
			 if(getElements(locator).size()>0) {
			 return true;
		  }
		  else
		  {
			return false;
		  }
	}
	
	
	
	
	
	
	
	public  List<WebElement> getElements(By Locator) {	
		//List<WebElement> links = driver.findElements(Locator);
	  //  return links;	    
		return  driver.findElements(Locator);
	}
	
	public  void clickElement(By locator, String wheretoclick) {
		//List<WebElement> elelist = driver.findElements(locator);// yo can collect eleemtns with any stategy
		List<WebElement> elelist =getElements(locator) ;
		// this will find all the elements with class name and enter manmohan several
		// times
		for (int i = 0; i < elelist.size(); i++) {
			String text = elelist.get(i).getText();
			System.out.println(text);
			// textfieldlist.get(i).sendKeys("manmohan");
			// if(textfieldlist.get(i).getText().equals("Cameras")) { // where ever see
			// Camera text click
			if (text.equals(wheretoclick)) {
				elelist.get(i).click();
				break;
			}
		}
	}
	
	//**************************Drop Down Utils**************************
	// When you have Select 
	public  WebElement getElement1(By locator) {
		return driver.findElement(locator);
	}    
	public  void doSelectByIndex(By locator, int index) {		
    	Select select = new Select(getElement(locator));
    	select.selectByIndex(index);    	
    }
	public  void doSelectByVisibleText(By locator, String text) {		
    	Select select = new Select(getElement(locator));
    	select.selectByVisibleText(text);    	
    }
	public  void doselectByValue(By locator, String value) {		
    	Select select = new Select(getElement(locator));
    	select.selectByValue(value);  	
    }
	
        public  List<String> getDropDownOtionValue(By locator) {		
		List<String> list = new ArrayList(); // why i am writing String because i want to stro string
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions(); // 20 minutes
		// System.out.println("total indusrrty options:"+optionList.size() );
		for (WebElement e : optionList) { // if DDTring string if WebElement than webelement
			String text = e.getText(); 
			// System.out.println(text); // istead of printing requrement is stor them into
			// list and return
			list.add(text);
		}
		return list;

	}	
	
	//**************************Drop Down Utils**********^^^^^^****************
	
        // ********************-Drop Down withot select class**************88
        //*********login buil in DropDwonWithOutSelectClass05 ********************
        public  void SelectDropDownFromListWitoutSelectClass(By locator, String value) {
    		List<WebElement> induslist = driver.findElements(locator);
    	//	System.out.println(induslist.size());
    		// for( String e: induslist) { // if STring thn use string
    		for (WebElement e : induslist) {
    			String text =e.getText();			
    			if(text.equals(value)) {
    				e.click();
    				break;
    			//System.out.println(text);
    			
    			}
    		}

        }
        // locator statergy should be xpath if tere is no select class
        public   void  selectChoicefromDropDown(By locator, String value) {
			List<WebElement> choicelist= driver.findElements(locator);		
			for( WebElement e: choicelist) {
				String text =e.getText();
				if(text.equals(value)) {
				System.out.println(text);
				e.click();
				break;
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
    	public  void selectChoicefromDropDown2(By locator, String... value) {// String... is calle strign aray
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
