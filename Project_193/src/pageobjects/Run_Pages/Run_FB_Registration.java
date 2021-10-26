package pageobjects.Run_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.Pages.FB_Home;
import pageobjects.Pages.FB_Reg;
import pageobjects.Pages.Testcases;

public class Run_FB_Registration {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		Testcases tests=new Testcases(driver);
		tests.User_Registration();

	}

}
