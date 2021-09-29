package framework.junit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url_Presented 
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
	public void Verifying_OrangeLoginPage()
	{
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
		System.out.println("Expected partial url presented");
		 
	}

}
