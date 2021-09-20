package mq.selenium.Objects_and_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_With_AutoCompleteTextbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		System.out.println("Browser is up and ready to use");
	
		
		WebElement From_Textbox=driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]"));
		From_Textbox.clear();
		From_Textbox.sendKeys("HYD");
		driver.findElement(By.xpath("//p[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")).click();
		
		
		/*
		 * Implicitwait:--> Manage Dynamic timegap..
		 */

	}

}
