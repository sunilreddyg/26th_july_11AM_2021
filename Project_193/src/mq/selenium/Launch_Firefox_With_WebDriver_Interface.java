package mq.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_With_WebDriver_Interface 
{

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver=new FirefoxDriver();		//launch browser
		driver.get("http://facebook.com");          //Load webpage
		driver.manage().window().maximize();        //Maximize browser window [Optional]
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);  //It hold execution for 5 seconds
		driver.close();
	}

}
