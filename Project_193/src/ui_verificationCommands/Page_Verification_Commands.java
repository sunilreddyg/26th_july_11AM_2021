package ui_verificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		
		//Get Current page title
		String page_title=driver.getTitle();
		System.out.println("Current window title is --> "+page_title);
		
		//Get Current page url
		String page_url=driver.getCurrentUrl();
		System.out.println("Current window url is ---> "+page_url);
		
		//Get Dynamic Window ID
		String WindowID=driver.getWindowHandle();
		System.out.println("Current Window ID is --> "+WindowID);
		
		//Get Page Source
		String pagesource=driver.getPageSource();
		System.out.println("Current page_source is --> "+pagesource);
		
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
