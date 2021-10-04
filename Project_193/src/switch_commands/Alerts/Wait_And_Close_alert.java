package switch_commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_And_Close_alert {

	public static void main(String[] args) throws Exception {
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://bridgeqsystems.com/demo.php");
	    driver.manage().window().maximize();
	    
	    //click Alert link at Menu tab
	   driver.findElement(By.xpath("//a[@id='v-pills-messages-tab']")).click();
	   Thread.sleep(2000);
	    
	   driver.findElement(By.xpath("//button[@data-target='#collapseAlertTwo']")).click();
	   Thread.sleep(2000);
	   
	    //This action will popup alert after 5 minutes
	    driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	    
	    //This syntax will wait until alert presented
	   new WebDriverWait(driver, 30)
	   .until(ExpectedConditions.alertIsPresent()).accept();
	   
	   

	}

}
