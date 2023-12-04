package practise;

import org.testng.annotations.*;

public class Class2 {

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Run before every method");
	}
	
	@Test
	public void demoTest3()
	{
		System.out.println("In third demoTest class");
	}
	
	@Test(groups= {"Regression"})
	public void demoTest1()
	{
		System.out.println("In first demoTest class");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Run after every method");
	}
	
	@Test(enabled = false)
	public void demoTest2()
	{
		System.out.println("In second demoTest class");
	}
	

	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("In After Suite");
	}
}
