package framework.junit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_Title_Presented 
{
	static WebDriver driver;

	@BeforeClass  //Invoke before execution of first @Test with in class
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterClass //Invoke after execution of last @Test with in class
	public static void tearDownAfterClass() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test //Invoke method to execute without object creation
	public void Verify_Outlook_SignUp_Page() throws Exception 
	{
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000);
		Assert.assertEquals("Selenium", driver.getTitle());
		System.out.println("Selenium Homepage title verified");
		driver.findElement(By.xpath("//span[contains(.,'Downloads')]")).click();
		Thread.sleep(3000);
		boolean flag=driver.getTitle().contains("Downloads | Selenium");
		Assert.assertTrue(flag);
		System.out.println("Partial title presented for downloads page");
	}
	

}
