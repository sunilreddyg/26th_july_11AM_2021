package browser_options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Headless_browser {

	public static void main(String[] args) 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);              //1st method
		options.addArguments("--headless");		//2nd method
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.findElement(By.id("email")).sendKeys("darshan");
		System.out.println("email is typed");
		
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));

	}

}
