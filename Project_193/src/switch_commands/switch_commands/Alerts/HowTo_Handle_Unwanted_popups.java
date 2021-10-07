package switch_commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowTo_Handle_Unwanted_popups 
{

	public static void main(String[] args) throws Exception
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    boolean flag=false;
	    try {
			driver.switchTo().alert();
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    if(flag==true)
	    {
	    	driver.switchTo().alert().accept();
	    }
	    else
	    {
	    	System.out.println("Alert is not presented");
	    }
		
		
	}

}
