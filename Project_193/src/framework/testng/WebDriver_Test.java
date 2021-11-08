package framework.testng;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class WebDriver_Test 
{
	WebDriver driver;
	String Driver_path="C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe";
	String url="http://facebook.com";
	
	
	
	@Test
	public void Tc001_Signup_link()
	{
		driver.findElement(By.linkText("Sign Up")).click();
		Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
		Reporter.log("Signup page loaded and title presented is --> "+driver.getTitle());
	}
	
	@Test
	public void Tc002_Login_link()
	{
		driver.findElement(By.linkText("Log In")).click();
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
		Reporter.log("Login page loaded and title presented is --> "+driver.getTitle());
	}
	
	
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get(url);
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(src, new File("screens\\"+method.getName()+".png"));
	  //Method class access current constructed method name
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", Driver_path);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() throws Exception
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
