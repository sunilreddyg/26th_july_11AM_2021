package diff_package_classes_And_Methods;

import mq.java.methods.InstantMethods.Browser;
import mq.java.methods.StaticMethods.CarBilling;

public class Run_Methods_And_Variables 
{

	public static void main(String[] args) 
	{
		
		
		Browser browser=new Browser();
		browser.openbrowser();
		browser.Minimize_browser();
		
		CarBilling.Cars_Sold_Today();
		CarBilling.Cars_Sold_This_Week();

	}

}
