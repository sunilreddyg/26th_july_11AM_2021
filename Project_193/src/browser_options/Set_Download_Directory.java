package browser_options;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Set_Download_Directory 
{

	public static void main(String[] args) 
	{
		
		
	
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "Define path to download");
		options.setExperimentalOption("prefs", prefs);
		
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");

		
		
		
		

	}

}
