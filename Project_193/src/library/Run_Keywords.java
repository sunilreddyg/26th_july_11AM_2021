package library;

import org.junit.Test;
import org.openqa.selenium.Keys;

public class Run_Keywords extends Common_Reusable_Actions
{
    String url="http://facebook.com";
    
	@Test
	public void test()
	{
		LaunchBrowser("chrome");
		setwindow_size(1025, 800);
		load_webpage(url);
		set_explicitwait_time(30);
		
		Type_text("//input[@id='email']", "Darshan");
		Type_text_using_js("//input[@id='pass']", "Hello123");
		click_element("//a[contains(.,'Create New Account')]");
		select_dropdown("//select[@id='day']", "text", "25");
		select_dropdown("//select[@id='month']", "value", "8");
		select_dropdown("//select[@id='year']", "index", "5");
		wait(5000);
		Send_keyboard_keys("//select[@id='year']", Keys.ARROW_DOWN);
		//capturescreen("registration");
	}

}
