package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_WaterMarkLabel_Displayed_At_Editbox {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		String Username_PlaceholderText=driver.findElement(By.id("email")).getAttribute("placeholder");
		if(Username_PlaceholderText.equals("Email address or phone number"))
			System.out.println("Testpass, Place holder text is available");
		else
			System.out.println("testfail, Placehodler text is not available");

	}

}
