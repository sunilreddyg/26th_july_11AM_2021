package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Option_Selection_Without_SelectionCommand {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		WebElement State_Andhra=driver.findElement(By.xpath("//option[@value='andhra-pradesh'][contains(.,'Andhra Pradesh')]"));
		State_Andhra.click();
		
		Thread.sleep(3000);  //Timeout to laod cities
		
		WebElement City_Kurnool=driver.findElement(By.xpath("//option[@value='kurnool'][contains(.,'Kurnool')]"));
		City_Kurnool.click();
		
		

	}

}
