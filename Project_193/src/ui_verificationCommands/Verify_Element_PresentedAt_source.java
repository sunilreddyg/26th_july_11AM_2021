package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_PresentedAt_source {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//Default method to verify element presented at source
		if(driver.getPageSource().contains("email"))
		{
			System.out.println("Element is presented");
		}
		else
		{
			System.out.println("element is not presented");
		}
		
		
		//2nd alternative to verify element presented at source
		boolean flag=false;
		try {
			driver.findElement(By.id("email"));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(flag==true)
		{
			driver.findElement(By.id("email")).sendKeys("Darshan");
		}
		
		

	}

}
