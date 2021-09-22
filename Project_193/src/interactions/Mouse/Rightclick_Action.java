package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_Action 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		//Performing right click action at object
		WebElement Element=driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
		new Actions(driver).contextClick(Element).perform();
		Thread.sleep(4000);
		
		
		WebElement Delete_From_ContextMenu=driver.findElement(By.xpath("//li[contains(.,'Delete')]"));
		new Actions(driver).click(Delete_From_ContextMenu).perform();
		
		

	}

}
