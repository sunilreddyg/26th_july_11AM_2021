package ui_verificationCommands.getCssvalue;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		WebElement RoundTrip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
	
		//Get obejct height and width
		Dimension Obj_dimensions=RoundTrip.getSize();
		int Obj_height=Obj_dimensions.getHeight();
		int Obj_width=Obj_dimensions.getWidth();
		
		System.out.println("Object height available is --> "+Obj_height);
		System.out.println("Object width available is --> "+Obj_width);
		
		
	}

}
