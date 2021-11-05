package captureScreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_ScreenShot 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Capturing image and converting into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Create new folder at local system
		FileHandler.createDir(new File("Screens"));
		//Copy file into target location
		FileHandler.copy(src, new File("Screens\\Image.png"));
		
		
		

	}

}
