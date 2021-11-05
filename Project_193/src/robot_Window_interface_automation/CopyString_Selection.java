package robot_Window_interface_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString_Selection {

	public static void main(String[] args) throws Exception {
		
		
		String text="Greetings from Judge Group (since 1970) ! "
				+ "Judge Group. is a Global Workforce Solutions"
				+ " Company headquartered at Pennsylvania,"
				+ " United States with its branch offices"
				+ "in Asia Pacific Region.We are one";
				
			
		//Selecting required string
	   StringSelection stext=new StringSelection(text);
	   //Get System Clipboard
	   Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
	   //Set Content to clipboard
	   clipboard.setContents(stext, stext);
	   
	   
	   
	  //Create notepad file at runtime
	  Runtime.getRuntime().exec("notepad.exe");
	  Thread.sleep(5000);
	
	 		
	   
	   //using Robot action press Cntrl+V method
	   Robot robot=new Robot();
	   robot.setAutoDelay(2000);
	   
	   //Press Cntrol+V
	   robot.keyPress(KeyEvent.VK_CONTROL);
	   robot.keyPress(KeyEvent.VK_V);
	   
	   //Release Down Keys Control
	   robot.keyRelease(KeyEvent.VK_CONTROL);
	   
	}

}
