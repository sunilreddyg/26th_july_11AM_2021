package library;


import org.junit.Test;

public class Run_ReusableKeywords_WithPOM_Objects extends TestCases_FB
{
	String fname="Arjun";
	String lastname="Kiran";
	String email="arjun@gmil.com";
	String retypemail="arjun@gmail.com";
	String password="Abc123";
	@Test
	public void test() 
	{
		
		setupbrowser();
		User_Registration(fname, lastname, email, retypemail, password);
		
	}

}
