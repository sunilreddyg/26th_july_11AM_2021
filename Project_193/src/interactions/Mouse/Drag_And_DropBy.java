package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement Scroller1=driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));
		WebElement Scroller2=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[2]"));
	
		new Actions(driver).dragAndDropBy(Scroller1, 100, 0).build().perform();
		new Actions(driver).dragAndDropBy(Scroller2, -50, 0).build().perform();
		

	}

}
