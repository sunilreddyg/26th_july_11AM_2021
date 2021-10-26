package pageobjects.Run_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.Pages.OrangeHRM_Login;

public class Run_User_Login 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		OrangeHRM_Login login=PageFactory.initElements(driver, OrangeHRM_Login.class);
		login.Username.sendKeys("Automation");
		login.Username.clear();
		Thread.sleep(3000);
		
		login.user_login("Admin", "admin123");
		
		
		

	}

}
