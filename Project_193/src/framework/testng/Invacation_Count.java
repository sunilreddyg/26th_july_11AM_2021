package framework.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Invacation_Count 
{
	String driver_path="C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe";				
	WebDriver driver;
	
	@Test(invocationCount=5,enabled=false)
	public void tc001()
	{
		System.out.println("test executed");
	}
	
	
	
	int count=1;
	@Test(invocationCount=10)  //This property allows @test method to run expected numeber of times.
	public void test()
	{
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		new Select(State_Dropdown).selectByIndex(count);
		count=count+1;
	}
	
	
	@BeforeClass
	public void Loadwebpage()
	{
		//set runtime environment variable
		System.setProperty("webdriver.chrome.driver",driver_path);
		driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
	}

}
