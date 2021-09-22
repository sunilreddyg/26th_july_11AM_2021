package interactions.Touch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Mobile_Touch_interactions {

	public static void main(String[] args) 
	{
		
		/*
		 * Don' Run this program [It just for syntax example]
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		
		/*
		 * Note:--> By Creation object ot TouchActions class
		 * 		    we can get MouseInteraction,KeyboardInteractions, TouchInteraction commands
		 */
		
		TouchActions touch=new TouchActions(driver);
		
		WebElement Element=driver.findElement(By.id("email"));
		touch.singleTap(Element).perform();  //Analog left click action at webpage
		
		//Double Tap on selected element
		touch.doubleTap(Element).perform();
		
		//Down Screen
		touch.down(200, 30).perform();
		
		
		//Down Screen
		touch.up(200, 30).perform();
		
		
		

	}

}
