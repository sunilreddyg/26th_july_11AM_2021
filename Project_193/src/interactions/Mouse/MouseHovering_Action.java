package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering_Action {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.manage().window().maximize();
	
	//Login into account
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();// TODO Auto-generated method stub
	 
	 
	 WebElement Leave_Tab=driver.findElement(By.xpath("//b[contains(.,'Leave')]"));
	 new Actions(driver).moveToElement(Leave_Tab).perform();
	 
	 WebElement Configure_Leave_Submenu=driver.findElement(By.xpath("//a[@id='menu_leave_Configure']"));
	 new Actions(driver).moveToElement(Configure_Leave_Submenu).perform();
	 
	 WebElement Configure_SubMenu_Holiday=driver.findElement(By.xpath("//a[contains(@id,'menu_leave_viewHolidayList')]"));
	 new Actions(driver).click(Configure_SubMenu_Holiday).perform();
	 
	 
	 
	}

}
