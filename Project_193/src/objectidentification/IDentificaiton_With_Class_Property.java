package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IDentificaiton_With_Class_Property {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		

		WebElement Signin_link=driver.findElement(By.xpath("(//a[@class='internal sign-in-link'])[2]"));
		Signin_link.click();
		
		WebElement Email=driver.findElement(By.className("form-control"));
		Email.clear();
		Email.sendKeys("sunilreddy.gajjala@outlook.com");
		
		
		WebElement Email_Next=driver.findElement(By.className("ext-primary"));
		Email_Next.click();
		/*
		 * Working with Class Identifier:-->
		 * 		=> Check duplication of class before use
		 * 		=> Don't use class property value along with spaces when object
		 * 				is identified with classname property
		 * 		=> because developer use spaces with in class to define
		 * 				multiple class properties..
		 * 
		 *  for Example:-->
		 *  		<div  class="navigation  Signin_link">
		 *  
		 *  			By.className("navigation Signin_link")   ----> Wrong
		 *  			
		 *  			By.className("navigation")
		 *  					[OR]
		 *  			By.className("Signin_links")      
		 *  			=> Make sure duplication of class individually before use it..
		 * 		
		 * 			Note:--> While defining class property along with Xpath
		 * 					and cssSelector locators we can include spaces...
		 * 
		 * 				By.xpath("//div[@class='navigation  Signin_link']")
		 * 				By.cssSelector("div[class='navigation Signin_link']")
		 */
		
		
	
		
	}

}
