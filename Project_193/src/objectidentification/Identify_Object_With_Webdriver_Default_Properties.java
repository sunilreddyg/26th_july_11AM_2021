package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Object_With_Webdriver_Default_Properties {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Hello1234");
		
		driver.get("https://www.facebook.com/");
	    driver.manage().window().setSize(new Dimension(800, 560));
	    driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
	    driver.findElement(By.xpath("//input[@id=\'pass\']")).sendKeys("hello12345");
	    driver.findElement(By.name("login")).click();

	}

}
