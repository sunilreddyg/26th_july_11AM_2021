package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_Until_Element_is_Invisible {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		
		try {
			
			new WebDriverWait(driver, 50).until
			(ExpectedConditions.invisibilityOfElementLocated(By.id("email")));
			System.out.println("Object is available at hidden state");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
