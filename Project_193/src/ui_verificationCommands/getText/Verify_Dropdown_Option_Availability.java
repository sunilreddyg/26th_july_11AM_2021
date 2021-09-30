package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Option_Availability {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify Expected City Available at City Dropdown
		 * 
		 * 			Given site url "https://v1.hdfcbank.com/branch-atm-locator"
		 * 			When user select any State Option
		 * 			Then verify Respected City names displayed under city dropdown
		 */
		

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//Selecting Dropdown option
		new Select(driver.findElement(By.xpath("//select[@id='customState']")))
		.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(4000);
		
		//Identify City Dropdown location
		WebElement CityDropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
		//Read All Options undeer City dropdown
		String Cities=CityDropdown.getText();
		
		//Verify Expected City Available
		if(Cities.contains("Guntur"))
			System.out.println("Expected city available");
		else
			System.out.println("Expected City not available");
		
		
		
		
		
		
		
		

	}

}
