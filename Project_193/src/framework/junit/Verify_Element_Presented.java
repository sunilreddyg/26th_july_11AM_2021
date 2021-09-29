package framework.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Presented 
{

	WebDriver driver;

	@Before
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024, 700));
	}

	@After
	public void tearDown() throws Exception 
	{
		Thread.sleep(4000);
		driver.close();
	}
	
	@Test
	public void Element_Presented_At_Source()
	{
		driver.get("http://facebook.com");
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		System.out.println("Facebook Homepage title is presented");
		
		//Verify Element Presented at source
		Assert.assertTrue(driver.getPageSource().contains("email"));
		driver.findElement(By.id("email")).sendKeys("qadarshan@gmail.com");
	
	}
	
	
	
	
}
