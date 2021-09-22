package interactions.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_And_KeyUp_Action 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
	    driver.manage().window().setSize(new Dimension(800, 560));
	    driver.switchTo().frame(0);
	    
	    //This action will hold down the control key..
	    Actions builder = new Actions(driver);
	    builder.keyDown(Keys.CONTROL).perform();
	    
	    driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
	    driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
	    driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
	    driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
	    
	    //This action will release down keys
	    builder.keyUp(Keys.CONTROL).perform();
	    
	
	}

}
