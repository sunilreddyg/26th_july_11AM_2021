package java_Script_Executor;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaScripExecutor_Select_DropdownOptions 
{

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//Selecting dropdown options using regular method
		new Select(driver.findElement(By.xpath("//select[@id='customState']")))
		.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(5000);
		
		//Selecting dropdown option using javascript
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('customState').value='Delhi'");
		Thread.sleep(4000);
		
		WebElement State_Dropdown=driver.findElement(By.xpath("//select[contains(@title,'Please select city')]"));
		js.executeScript("arguments[0].selectedIndex=1",State_Dropdown);
		
	}

}
