package browser_options.ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class IEOptions 
{

	public static void main(String[] args) {
		
		
		InternetExplorerOptions ieoptions=new InternetExplorerOptions();
		ieoptions.ignoreZoomSettings();
		ieoptions.enablePersistentHovering();
		ieoptions.introduceFlakinessByIgnoringSecurityDomains();
		ieoptions.requireWindowFocus();
		ieoptions.takeFullPageScreenshot();
		ieoptions.withInitialBrowserUrl("http://google.com");
		
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(ieoptions);
		driver.get("http://naukri.com");
		
	}

}
