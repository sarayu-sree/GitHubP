package repractise;

import org.testng.annotations.*;

public class ClassTest2 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("B4 Class classtest2 -> before all methods in class");
	}
	
	@Test
	public void classtest2_1()
	{
		System.out.println("classtest2 method 1");
	}
	
	@Test
	public void classtest2_2()
	{
		System.out.println("classtest2 method 2");
	}
	
	@Test
	public void classtest2_3()
	{
		System.out.println("classtest2 method 3");
	}
	
	@AfterClass()
	public void afterClass()
	{
		System.out.println("After Class classtest2 -> runs after Class");
	}
	
}
