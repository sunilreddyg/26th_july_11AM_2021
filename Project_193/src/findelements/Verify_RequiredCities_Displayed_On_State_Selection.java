package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_RequiredCities_Displayed_On_State_Selection {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		List<WebElement> AllOptions=State_Dropdown.findElements(By.tagName("option"));
		AllOptions.remove(0);  //Removing first index object
		
		
		String Exp_Cities[]= 
			{
				"South Andaman",
				"Anantapur",
				"East Siang",
				"Darrang",
				"Arwal",
				"Chandigarh",
			};
		
		
		for (int i = 5; i < Exp_Cities.length; i++)
		{
			WebElement EachOption=AllOptions.get(i);
			String StateName=EachOption.getText();
			EachOption.click();
			Thread.sleep(4000);
			
			//Identify City Dropdown and Read all options
			String Act_Cities=driver.findElement(By.id("customCity")).getText();
			if(Act_Cities.contains(Exp_Cities[i]))
			{
				System.out.println("TestPass, For State --> "+StateName+"  --> City Displayed -->"+Exp_Cities[i]);
			}
			else
			{
				System.out.println("TestFail, For State --> "+StateName+"  --> City Displayed -->"+Exp_Cities[i]);
			}
			
		}
		
		
		
		
		
		
		

	}

}
