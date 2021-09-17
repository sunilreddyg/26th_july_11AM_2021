package mq.selenium.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Item_From_List 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		WebElement Open_Exp_list=driver.findElement(By.xpath("//input[@id='cjaExp']"));
		Open_Exp_list.click();
		Thread.sleep(2000);
		
		WebElement Option=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/form/div[3]/div[2]/div/div[2]/div/div/div[1]/ul/li[6]"));
		Option.click();
		
	}

}
