package browser_options;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_MergeTo_ChromeOptions {

	public static void main(String[] args) 
	{
		
		DesiredCapabilities capabilities=new DesiredCapabilities().chrome();
		capabilities.setJavascriptEnabled(true);
		capabilities.setPlatform(Platform.WINDOWS);
		
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		options.merge(capabilities);
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");
		System.out.println("Browser is launched");
	}

}
