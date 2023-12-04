package practise;

import org.testng.annotations.*;

public class Class3 {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("In Before Suite method");
	}
	
	@Test(groups= {"Regression"})
	@Parameters({"browser","URL"})
	public void demoTesting1(String browser, String url)
	{
		System.out.println("In first demoTesting class");
		System.out.println(browser);
		System.out.println(url);
	}
	
	@Test
	public void demoTesting2()
	{
		System.out.println("In second demoTesting class");
	}
	
	@Test
	public void demoTesting3()
	{
		System.out.println("In third demoTesting class");
	}
	
}
