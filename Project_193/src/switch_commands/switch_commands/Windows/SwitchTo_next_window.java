package switch_commands.Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_next_window {

	public static void main(String[] args) throws Exception
	{
		
	//Note:--> Use this program when we have main window and single sub window
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    
	    String MainwindowId=driver.getWindowHandle();
	    System.out.println(MainwindowId);
	    
	    //Click Hyperlink [It open page in new window]
	    WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
	    Instagram_link.click();
	   
	   
	  //Get All Window IDs
	    Set<String> AllWindowIDs=driver.getWindowHandles();
	    
	    for (String EachWindowID : AllWindowIDs) 
	    {
			driver.switchTo().window(EachWindowID);
		}
	   
	    System.out.println(driver.getTitle());
	    driver.close();  //it Close instagram window
	    
	    //Switch to Mainwindow
	    driver.switchTo().window(MainwindowId);
	    
	    
	    //click on hyper link
	    driver.findElement(By.linkText("Oculus")).click();
	    Thread.sleep(4000);
	    
	    //Get All Dynamic Windows
	    Set<String> allwindowsids=driver.getWindowHandles();
	    for (String eachwindow : allwindowsids) 
	    {
	    	//accept condition when main windowid not equals with each window id
			if(!eachwindow.equals(MainwindowId))
			{
				driver.switchTo().window(eachwindow);
				break;
			}
		}
	    
	    
	    
	    
	    
	    
	   
	   
	   
	    
	    
	    
	    
	    
	    
	  
		

	}

}
