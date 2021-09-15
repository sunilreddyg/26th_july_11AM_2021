package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_keyboard_ShortCuts {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[@data-task='signin'])[1]"));
		Signin_btn.click();
		
		WebElement Username=driver.findElement(By.name("loginfmt"));
		Username.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(4000);
		
		WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys("Hello123456"+Keys.ENTER);
		
		

	}

}
