package library;

public class Run_CommonReusable_Actions {

	public static void main(String[] args) 
	{
		
		Common_Reusable_Actions repository=new Common_Reusable_Actions();
		repository.LaunchBrowser("ie");
		repository.setwindow_size(1025, 800);
		repository.load_webpage("http://facebook.com");
		repository.set_implicitwait(30);
		repository.set_explicitwait_time(50);
		
		
		
	}

}
