package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_PresenceOfElement_Located {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		
		try {
			
			new WebDriverWait(driver, 100).until
			(ExpectedConditions.presenceOfElementLocated(By.className("login")));
			System.out.println("Object presented at source");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
