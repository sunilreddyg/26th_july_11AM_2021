package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_Visible_At_Page {

	public static void main(String[] args) throws Exception 
	{

		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(4000);
		
		
		//Identify Page
		WebElement Page=driver.findElement(By.tagName("body"));
		String Page_Visible_Text=Page.getText();
		System.out.println(Page_Visible_Text);
		
		String Exp_msg="Enter a valid email address, phone number, or Skype name.";
		//Verify expected text available at webpage
		if(Page_Visible_Text.contains(Exp_msg))
		{
			System.out.println("Testpass, Expected message visible at webpage");
		}
		else
		{
			System.out.println("Testfail, Expected message not visible at webpage");
		}
	}

}
