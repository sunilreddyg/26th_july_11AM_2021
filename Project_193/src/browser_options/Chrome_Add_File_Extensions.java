package browser_options;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Add_File_Extensions 
{

	public static void main(String[] args)
	{
	
		//Adding extensions to automation browser
		
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\Truepath2.crx"));
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\XY.crx"));
		
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");

	}

}
