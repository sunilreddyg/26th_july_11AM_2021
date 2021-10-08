package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_until_Elementvisibleat_webpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		//Hide email object for webpage
		((JavascriptExecutor)driver).executeScript("document.getElementById('email').setAttribute('style','display:none')");
		System.out.println("Email object is hidden");
		
		try {
			//Create object for WebDriverwait
			WebDriverWait wait=new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("Darshan");
			System.out.println("username typed into email textbox");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
