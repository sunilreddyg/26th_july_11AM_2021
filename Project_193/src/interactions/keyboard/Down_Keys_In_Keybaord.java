package interactions.keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Down_Keys_In_Keybaord {

	public static void main(String[] args) 
	{
		
		/*
		 * Don' Run this program [It just for syntax example]
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		
		
		//Press [Alt+Contrl+T]
		new Actions(driver)
		.keyDown(Keys.ALT)
		.keyDown(Keys.CONTROL)
		.sendKeys(Keys.chord("T"));  //Chord method use to target specific alphabet characte
		
		
		//Press [Alt+Contrl+T]
		new Actions(driver)
		.keyDown(Keys.ALT)
		.keyDown(Keys.CONTROL)
		.sendKeys("T");
		
		
		

	}

}
