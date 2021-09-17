package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Multiple_Selection_status
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		WebElement SelectMenu_link=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenu_link.click();
		Thread.sleep(2000);
		
		
		WebElement Month_Dropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		boolean flag=new Select(Month_Dropdown).isMultiple();
		System.out.println(flag);
		
		
		WebElement  Country_dropdown=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag1=new Select(Country_dropdown).isMultiple();
		System.out.println("Country dropdown multiple selection status is --> "+flag1);
		
		
		
		
		

	}
}
