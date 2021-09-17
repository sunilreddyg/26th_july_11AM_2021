package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Multiple_Option_Selection_Count 
{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		WebElement SelectMenu_link=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenu_link.click();
		Thread.sleep(2000);
		
		WebElement  Country_dropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		boolean flag=new Select(Country_dropdown).isMultiple();
		System.out.println("Country dropdown multiple selection status is --> "+flag);
		

		
		//Decision statement to continue execution of multile selection dropdown
		if(flag==true)
		{
			Select Country_Selector=new Select(Country_dropdown);
			Country_Selector.deselectAll();   //Deselct command only work when object is multiple selection type
			Country_Selector.selectByValue("ind");
			Country_Selector.selectByVisibleText("Japan");
			Country_Selector.selectByIndex(5);
			
			int SelectionCount=Country_Selector.getAllSelectedOptions().size();
			if(SelectionCount > 1)
			{
				System.out.println("Testpass, Dropdown accepting more than one option");
			}
			else
			{
				System.out.println("Testfail, Dropdown not accepting more that one option");
			}
			
		}
		else
		{
			System.out.println("Dropdown is not multiple selection type");
		}
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
