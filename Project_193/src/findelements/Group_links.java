package findelements;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Footer_Area=driver.findElement(By.xpath("//*[@id='react-root']/section/footer/div/div[1]"));
		//Finding list of links
		List<WebElement> AllLinks=Footer_Area.findElements(By.tagName("a"));
		System.out.println(AllLinks.size());
		
		
		for (int i = 0; i < AllLinks.size(); i++) 
		{
			//Get Each link using index number
			WebElement EachLink=AllLinks.get(i);
			String LinkName=EachLink.getText();
			String Linkhref=EachLink.getAttribute("href");
			//System.out.println(LinkName+"    "+Linkhref);
			
			//Get Target Property for links
			String Target_Value=EachLink.getAttribute("target");
			EachLink.click();
			Thread.sleep(2000);
			
		
			
			String MainWindow=driver.getWindowHandle();
			
			if(Target_Value.equals("_blank"))
			{
				Set<String> allwindows=driver.getWindowHandles();
				for (String Eachwindow : allwindows) 
				{
					driver.switchTo().window(Eachwindow);
					
				}
				System.out.println(LinkName+"       "+driver.getTitle());
				driver.switchTo().window(MainWindow);
				Thread.sleep(2000);
			}
			else
			{
				 System.out.println(LinkName+"       "+driver.getTitle());
				 driver.navigate().back();
				 Thread.sleep(2000);
			}
			
			//Restoring all page reference to avoid staleElement Reference exception
			Footer_Area=driver.findElement(By.xpath("//*[@id='react-root']/section/footer/div/div[1]"));
			AllLinks=Footer_Area.findElements(By.tagName("a"));
			  
		}
		
		
		
	}

}
