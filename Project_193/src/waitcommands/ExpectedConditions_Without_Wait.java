package waitcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpectedConditions_Without_Wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.facebook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		System.out.println("browser is up and ready to use");	
		
		
		String Exp_title="Facebook – log in or sign up";
		boolean flag=ExpectedConditions.titleIs(Exp_title).apply(driver);
		System.out.println("Title presented status is --> "+flag);
		
		
		

	}

}
