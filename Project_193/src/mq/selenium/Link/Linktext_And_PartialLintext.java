package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_And_PartialLintext {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Add")).click();
		Thread.sleep(2000);
		
		
		
		
		

	}

}
