package mq.java.methods.InstantMethods;

public class TestApp 
{
	
	public void enter_username()
	{
		System.out.println("username is entered");
	}
	
	public void password_Entry()
	{
		System.out.println("password is entered");
	}
	
	public void Click_login_button()
	{
		System.out.println("Login Button clicked");
	}

	
	public void user_login()
	{
		enter_username();
		password_Entry();
		Click_login_button();
	}
	public static void main(String[] args) 
	{
		
		TestApp app=new TestApp();
		app.enter_username();
		app.password_Entry();
		app.Click_login_button();
		
		app.user_login();

	}

}
