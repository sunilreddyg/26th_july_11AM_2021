package mq.selenium.Objects_and_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Date_From_DataPicker 
{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Login into account
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 
		 WebElement Leave_Tab=driver.findElement(By.xpath("//b[contains(.,'Leave')]"));
		 Leave_Tab.click();
		 
		 WebElement From_Calendar_Icon=driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]"));
		 From_Calendar_Icon.click();
		 Thread.sleep(2000);
		 
		 new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")))
		 .selectByVisibleText("Nov");
		 Thread.sleep(2000);
		 
		 //Click on Date link
		 driver.findElement(By.linkText("24")).click();
		
		 //Select Checkbox  [Webdriver support click method to Select and Deselect checkbox]
		 driver.findElement(By.xpath("//input[contains(@id,'allcheck')][@type='checkbox']")).click();

	}

}
