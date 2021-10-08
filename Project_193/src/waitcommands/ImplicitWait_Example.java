package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_Example {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		long start_time=System.currentTimeMillis();
		try {
			driver.findElement(By.id("email"));
			System.out.println("Element is identified");
			System.out.println(System.currentTimeMillis()-start_time);
			
		} catch (Exception e) {
			System.out.println("Element not found at source");
			System.out.println(System.currentTimeMillis()-start_time);
		}
		
		
		
		

	}

}
