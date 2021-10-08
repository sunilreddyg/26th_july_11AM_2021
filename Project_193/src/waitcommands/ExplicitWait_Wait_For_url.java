package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_url {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		
		String exp_url="https://www.selenium.dev/";
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.urlToBe(exp_url));
			System.out.println("Selenium page url is verified");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Mangage explicit wait until expected url presented
		WebElement Download_button=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
		Download_button.click();
		
		//manage explicitwait until partial url presented..
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("documentation"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
