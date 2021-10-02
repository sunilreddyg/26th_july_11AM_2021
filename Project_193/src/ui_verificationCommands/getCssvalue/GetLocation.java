package ui_verificationCommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		WebElement RoundTrip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
	
		//Get Object x and y coordinates
		Point Obj_point=RoundTrip.getLocation();
		int Obj_x=Obj_point.getX();
		int Obj_y=Obj_point.getY();
		
		System.out.println("Object x coordinates are --. "+Obj_x);
		System.out.println("Object y coordinates are --> "+Obj_y);
		
		
		//Verify Obejct is visible at webpage
		if(Obj_x > 0)
		System.out.println("Object is visble at webpage");
		else
			System.out.println("Object hidden at webpage");
		
		

	}

}
