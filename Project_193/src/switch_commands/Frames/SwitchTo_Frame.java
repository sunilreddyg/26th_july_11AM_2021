package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame 
{
	
	public static void main(String args[]) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    //switch to frame using FrameID
	    driver.switchTo().frame("modal_window");
	    Thread.sleep(3000);
	    
	  
	    WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	    email.clear();
	    email.sendKeys("darshan@123");
	    
	    WebElement TripId=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
	    TripId.clear();
	    TripId.sendKeys("4646465654");
	    
	    //This command bring controls from frame to Webpage
	    driver.switchTo().defaultContent();
	    
	   WebElement FeedBackLink=driver.findElement(By.xpath("//a[@href='javascript:void(0);'][contains(.,'Feedback')]"));
	   FeedBackLink.click();
	   Thread.sleep(5000);
	   
	  WebElement FeedBackFrame=driver.findElement(By.xpath("//iframe[@src='https://www.cleartrip.com/supportstatic/mail/index.shtml?srctype=feedback']"));
	  driver.switchTo().frame(FeedBackFrame);
	 
	  //click on Back to home button
	  driver.findElement(By.xpath("//button[contains(.,'Back to home')]")).click();
	}

}
