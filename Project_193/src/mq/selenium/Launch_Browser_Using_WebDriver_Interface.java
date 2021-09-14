package mq.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser_Using_WebDriver_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 * Webdriver interface class contains set of methods
		 * to manipulate /automate all browser instances
		 */
		
		//Setting runtime environment variable for chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//Launching chrome and store into Webdriver Inteface
		WebDriver driver=new ChromeDriver();
		//Load webpage using webdriver inteface method
		driver.get("http://facebook.com");
		
		
		/*
		 * Exceptions:-->
		 * 	
		 * 	IllegalStateException:-->
		 * 				System.setProperty("Keyname","path of the driver.exe");
		 * 				This exception present when browser driver not located at current System
		 * 								(or)
		 * 				define a wrong path or  wrong keyname
		 * 
		 *  SessionNotCreated:-->
		 *  			driver.get("http://facebook.com");
		 *  			This exception present when browser version mismatch with 
		 *  			browser driver version
		 *  
		 *  InvalidArgumentException:-->
		 *  			This exception present when url define in wrong format
		 *  			
		 *  			Valid :-->
		 *  				driver.get("https://facebook.com");
		 *  				driver.get("https://www.facebook.com");
		 *  
		 *  			invalid:-->
		 *  				driver.get("facebook.com");
		 *  				driver.get("www.facebook.com");
		 *  				driver.get("htp:facebook.com");
		 *  
		 * 
		 */
		
		
		
	}

}
