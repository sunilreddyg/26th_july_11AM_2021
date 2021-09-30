package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_Presented_At_location {

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
		
		String Exp_msg="Enter a valid email address, phone number, or Skype name.";
		
		//identify Text location
		WebElement Error_Location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String Act_Errmsg=Error_Location.getText();
		
		//Verify Actual Msg matches wth Expected msg
		if(Act_Errmsg.equals(Exp_msg))
		{
			System.out.println("Testpass, Expected error message displayed");
		}
		else
		{
			System.out.println("Testfail, Expected error message not displayed");
		}
		
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		

	}

}
