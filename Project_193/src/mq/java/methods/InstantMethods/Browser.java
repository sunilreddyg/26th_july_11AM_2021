package mq.java.methods.InstantMethods;

public class Browser 
{
	
	//Instant Method
	public void openbrowser()
	{
		System.out.println("Browser is opened");
	}

	//Instant Methods
	public void Minimize_browser()
	{
		System.out.println("Minimized Browser");
		
	}


	public static void main(String[] args) 
	{
		/*
		 * Crate object for Class
		 * 		Classname obj=new Classname();
		 * 		obj.methodname();
		 */
		
		Browser browser=new Browser();
		browser.openbrowser();
		browser.Minimize_browser();
		
	}

}
