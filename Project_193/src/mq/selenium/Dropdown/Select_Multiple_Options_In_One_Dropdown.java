package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_Options_In_One_Dropdown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		WebElement SelectMenu_link=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenu_link.click();
		Thread.sleep(2000);
		
		WebElement  Country_dropdown=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag=new Select(Country_dropdown).isMultiple();
		System.out.println("Country dropdown multiple selection status is --> "+flag);
		

		
		//Decision statement to continue execution of multile selection dropdown
		if(flag==true)
		{
			new Select(Country_dropdown).deselectAll();   //Deselct command only work when object is multiple selection type
			new Select(Country_dropdown).selectByValue("ind");
			new Select(Country_dropdown).selectByVisibleText("Japan");
			new Select(Country_dropdown).selectByIndex(5);
		}
		else
		{
			System.out.println("Dropdown is not multiple selection type");
		}
		
		
	}

}
