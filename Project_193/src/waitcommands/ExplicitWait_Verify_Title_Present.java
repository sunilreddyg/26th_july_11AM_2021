package waitcommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait_Verify_Title_Present {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.facebook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		System.out.println("browser is up and ready to use");	
		
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
			System.out.println("FB homepage title is verified");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//a[@href='/marketplace/']")).click();
		
		
		try {
			wait.until(ExpectedConditions.titleContains("Marketplace"));
			System.out.println("Marketplace title presented");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

}
