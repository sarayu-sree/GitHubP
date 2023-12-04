package repractise;

import org.testng.annotations.*;

public class ClassTest1 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("B4 suites -> executes first");
	}

	
	@BeforeMethod()
	public void beforeMethod()
	{
		System.out.println("B4 method classtest1 -> runs before method");
	}
	
	@Test
	@Parameters({"browser","URL"})
	public void classtest1_1(String brwsr, String url)
	{
		System.out.println("classtest1 method 1");
		System.out.println(brwsr);
		System.out.println(url);
	}
	
	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("After method classtest1 -> runs after method");
	}

	

}
