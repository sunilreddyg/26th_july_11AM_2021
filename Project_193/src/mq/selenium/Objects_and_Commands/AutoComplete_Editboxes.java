package mq.selenium.Objects_and_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editboxes 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Login into account
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 
		 //Clicking on admin TAB
		 driver.findElement(By.cssSelector("#menu_admin_viewAdminModule > b")).click();
		   
		//Type Referral text into AutoComplete Editbox 
		WebElement EmployeeName=driver.findElement(By.id("searchSystemUser_employeeName_empName"));
		EmployeeName.clear();
		EmployeeName.sendKeys("Anth");
		Thread.sleep(4000); //Time to load sugesstions
		driver.findElement(By.xpath("(//li[contains(.,'Anthony Nolan')])[2]")).click();
		System.out.println("Required option available at list");
		
		/*
		 * How to Select Auto-Complte Text:-->
		 * 
		 * 			Step1:--> Type reference characters into Textbox
		 * 			Step2:--> Wait until software display sugesstions
		 * 			Step3:--> Identify Location of Required Sugesstion and Perform Click action on it
		 */

	}

}
