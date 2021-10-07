package switch_commands.Windows;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_IteratorClass 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	  
	    
	    //Click Hyperlink [It open page in new window]
	    WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
	    Instagram_link.click();
	    
	    
	    //Get All Window Dynamic ID's
	   Set<String>  allwindowids= driver.getWindowHandles();
	   //Convert all window id's into iterators
	   Iterator<String> itr=allwindowids.iterator();
	    
	   //Read Each iterator using Next keyword
	    String w1=itr.next();
	    String w2=itr.next();
	    
	    System.out.println("before switch --> "+driver.getTitle());
	    driver.switchTo().window(w2);
	    System.out.println("After switch --> "+driver.getTitle());
	    
	    

	}

}
