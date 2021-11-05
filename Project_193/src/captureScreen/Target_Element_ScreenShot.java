package captureScreen;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Target_Element_ScreenShot 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Login_Form=driver.findElement(By.id("loginForm"));
		File src=Login_Form.getScreenshotAs(OutputType.FILE);
		//Copy file into target location
		FileHandler.copy(src, new File("Screens\\LoginForm.png"));
				
				
		
		//Scoll to view
		WebElement footer_area=driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/footer"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",footer_area);
		Thread.sleep(4000);
		
		File src1=footer_area.getScreenshotAs(OutputType.FILE);
		//Copy file into target location
		FileHandler.copy(src1, new File("Screens\\footerlinks.png"));
				
				
		
	}

}
