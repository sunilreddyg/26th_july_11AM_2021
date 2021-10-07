package switch_commands.Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Required_Window_When_Multiple_Windows_Opened {

	public static void main(String[] args) throws Exception
	{
	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Capture current Window dynamic id
		String Main_windowID=driver.getWindowHandle();
		System.out.println(Main_windowID);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All Dynamic window ID's  [Set is a unorder collection of object]
		Set<String> allwindowIDS=driver.getWindowHandles();
		for (String eachwindowid : allwindowIDS)
		{
			driver.switchTo().window(eachwindowid);
			String Runtime_title=driver.getTitle();
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break; //Break iteration once expected window title matches
			}
		}
		
		
		System.out.println("Current Focused title is --> "+driver.getTitle());
		


	}

}
