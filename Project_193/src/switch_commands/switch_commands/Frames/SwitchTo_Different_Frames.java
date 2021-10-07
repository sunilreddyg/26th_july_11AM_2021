package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Different_Frames {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    //Switch to frame using frame id
	    driver.switchTo().frame("menuFrame");
	    
	    WebElement FeeStructure=driver.findElement(By.xpath("//a[@href='FeestructureReport.do']"));
	    FeeStructure.click();
	    Thread.sleep(4000);
	    
	    //Get Controls back to mainpage
	    driver.switchTo().defaultContent();
	    
	  
	    //Switch to Next frame
	    driver.switchTo().frame("bodyFrame");
	    
	    //identifying object under frame
	    new Select(driver.findElement(By.xpath("//select[@id='univ']")))
	    .selectByIndex(3);


	}

}
