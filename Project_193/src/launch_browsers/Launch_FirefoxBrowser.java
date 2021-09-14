package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_FirefoxBrowser {

	public static void main(String[] args) throws Exception {
		

		/*
		 * Downlaod geckodriver.exe file
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll Down page until Display Browsers
		 * 		=> Click on +Browsers button
		 * 		=> Click on Documentation under firefox browser
		 * 		=> Check Suitable geckodriver version w.r.t selenium & chrome browser version
		 * 		=> 
		 * 		
		 * 		
		 */
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\Browser_Drivers\\chromedriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://facebook.com");
		
		System.out.println(firefox.getTitle());
		
		Thread.sleep(4000);
		firefox.close();
	}

}
