package switch_commands.ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target_ActiveElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.switchTo().activeElement().sendKeys("darshan");
		
		

	}

}
