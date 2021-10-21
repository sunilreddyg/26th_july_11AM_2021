package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Each_Dropdown_Options {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		List<WebElement> AllOptions=State_Dropdown.findElements(By.tagName("option"));
		System.out.println("Option Count is --> "+AllOptions.size());
		
		for (int i = 0; i < AllOptions.size(); i++)
		{
				WebElement EachOption=AllOptions.get(i);
				//Get Option Text
				String OptionName=EachOption.getText();
				System.out.println(OptionName);
				
				EachOption.click();
				Thread.sleep(500);
		}
		
		
		
		
		
	}

}
