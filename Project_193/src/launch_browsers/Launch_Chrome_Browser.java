package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Downlaod ChromeDriver.exe file
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll Down page until Display Browsers
		 * 		=> Click on +Browsers button
		 * 		=> Click on Documentation under chrome browser
		 * 		=> Findout what was the current chrome browser 
		 * 				installed in your computer
		 * 		=> How to findout chrome browse version
		 * 					1. Chrome Setting 
		 * 					2. Help  ---> About Chrome browser
		 * 		=> W.r.t to chrome browser click on ChomeDriver link
		 * 		=> W.r.t operating system download file 
		 * 					for windows [chromedriver_win32.zip]
		 * 		=> unzip file to any folder
		 * 		=> After unzip action we receive chromedriver.exe file
		 * 		
		 */
		
		//Setting runtime environment variable for chromdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\Browser_Drivers\\chromedriver.exe");
		//Launching browser and storing into referenced class
		ChromeDriver chrome=new ChromeDriver();
		//Loading page by navigating to specific url
		chrome.get("http://facebook.com");
		
		//printing current browse window title
		System.out.println(chrome.getTitle());
		
		Thread.sleep(5000);   //Add throws excpetion to method
		chrome.close();       //Close current WebDriver browser window
	}

}
