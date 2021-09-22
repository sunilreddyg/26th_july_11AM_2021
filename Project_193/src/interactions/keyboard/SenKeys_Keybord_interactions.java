package interactions.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SenKeys_Keybord_interactions 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		WebElement Languages=driver.findElement(By.xpath("//div[@id='msdd']"));
		Languages.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'English')]")).click();
		
		new Actions(driver).click().perform();
		Thread.sleep(2000);
		
		new Select(driver.findElement(By.xpath("//select[@id='Skills']")))
		.selectByVisibleText("AutoCAD");
		
		
		//Click Open Combobox
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		Thread.sleep(2000);
		WebElement Comobo_Textbox=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		new Actions(driver)
		.sendKeys(Comobo_Textbox,"ind")
		.pause(2000)
		.sendKeys(Keys.ENTER)
		.perform();

	}

}
