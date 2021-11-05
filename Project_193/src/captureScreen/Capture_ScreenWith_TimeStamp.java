package captureScreen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_ScreenWith_TimeStamp 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Date d=new Date();  
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-EEE-dd-hh-mm-ss");
		//Covert date into simple dateformat
		String date_and_time=sdf.format(d);
		
		WebElement Login_Form=driver.findElement(By.id("loginForm"));
		File src=Login_Form.getScreenshotAs(OutputType.FILE);
		//Copy file into target location
		FileHandler.copy(src, new File("Screens\\LoginForm"+date_and_time+".png"));
				
				
		

	}

}
