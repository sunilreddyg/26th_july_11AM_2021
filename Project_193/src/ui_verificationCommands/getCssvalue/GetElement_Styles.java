package ui_verificationCommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetElement_Styles {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		WebElement RoundTrip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
	
		//Verify Text available in Uppercase
		String TexTransform=RoundTrip.getCssValue("text-transform");
		if(TexTransform.contains("uppercase"))
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
		
		
		//Get Roundtrip Color before selection
		String Obj_color=RoundTrip.getCssValue("color");
		System.out.println("Color displayed before selection is --> "+Obj_color);
		
		
		//Seelct Roundtrip
		RoundTrip.click();
		
		//Get roundtrip color after selection
		String Changed_color=RoundTrip.getCssValue("color");
		System.out.println("Color displayed after selection is --> "+Changed_color);
		
		
		
		//Get Object Color
		Color Rountrip_color=Color.fromString(RoundTrip.getCssValue("color"));
		System.out.println(Rountrip_color.asHex().equals("#000000"));
		System.out.println(Rountrip_color.asRgb().equals("rgb(0, 0, 0)"));
		System.out.println(		Rountrip_color.asRgba().equals("rgba(0, 0, 0, 1)"));
		
		
		
		
		
		
		
		
		

	}

}
