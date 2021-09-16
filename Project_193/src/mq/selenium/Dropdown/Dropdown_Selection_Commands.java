package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Commands {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(3000);  //Timeout to laod cities
		
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("krishna");
		
		driver.findElement(By.name("localityName")).sendKeys("Gandhi Nagar");
		
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);
		
		
	}

}
