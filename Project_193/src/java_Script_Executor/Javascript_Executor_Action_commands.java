package java_Script_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor_Action_commands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type Text into Editbox
		js.executeScript("document.getElementById('email').value = 'Johnny Bravo'");
		
		//Click Method
		js.executeScript("document.getElementById('email').click()");
		
		
		
		
	}

}
