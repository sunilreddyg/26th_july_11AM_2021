package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_Title 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		
		//Get Current page title
		String page_title=driver.getTitle();
		String exp_title="Selenium";
		
		//Verify Equal Comparision between two Strings
		boolean flag=page_title.equals(exp_title);
		
		if(flag==true)
		{
			System.out.println("Homepage title is verified");
			WebElement Downloads=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
			Downloads.click();
			//Verify page title of downloads
			if(driver.getTitle().equals("Downloads | Selenium"))
			{
				System.out.println("Download page title verified");
			}
			else
			{
				System.out.println("Downlaod page title not verified");
			}
		}
		else
		{
			System.out.println("Homepage Title is not verified");
		}
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
