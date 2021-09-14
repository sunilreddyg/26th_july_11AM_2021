package framework.junit;
import org.junit.Assert;
import org.junit.Test;

class MyjuniTest
{

	@Test
	void test1() 
	{
		System.out.println("Test1 Running");
		Assert.assertTrue(false);
		System.out.println("Test1 passed");
	}
	
	@Test
	void test2() 
	{
		System.out.println("Test2 Running");
		Assert.assertTrue(true);
		System.out.println("Test2 Passed");
	}


}
