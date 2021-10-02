package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_Attribute_Value {

	public static void main(String[] args) throws Exception {
		/*
		 * Scenario:--> Verify Roundtrip radio button selection
		 * 		Given site url is "http://makemytrip.com"
		 * 		And verify triptype selecton oneway on browser launch
		 * 		When user tap on return date for bigger discounts
		 * 		Then Selection comes to roundtrip from oneway
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://makemytrip.com");
		driver.manage().window().setSize(new Dimension(1360, 760));
		Thread.sleep(5000);
		
		WebElement Oneway_TripType=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		String Oneway_Runtim_status=Oneway_TripType.getAttribute("class");
		
		if(Oneway_Runtim_status.contains("selected"))
		{
			System.out.println("As expected onway triptype is selected");
			
			WebElement Return_Date_Cal=driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10'][contains(.,'RETURN')]"));
			Return_Date_Cal.click();
			Thread.sleep(3000);
			
			WebElement Roundtrip_triptype=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
			String RoundTrip_Status=Roundtrip_triptype.getAttribute("class");
			
			if(RoundTrip_Status.contains("selected"))
				System.out.println("Testpass, Roundtrip Is Selected on opening return date calendar");
			else
				System.out.println("Testfail, Roundtrip is not selected on opening return date calendar");
		}
		else
		{
			System.out.println("On Browser launch oneway trip type is not selected");
		}
		
		
		
		

	}

}
