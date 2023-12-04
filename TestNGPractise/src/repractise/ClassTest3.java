package repractise;

import org.testng.annotations.*;

public class ClassTest3 {
	
	@BeforeMethod()
	public void beforeMethod()
	{
		System.out.println("B4 method classtest3 -> runs before method");
	}
	
	@Test
	public void classtest3_1()
	{
		System.out.println("classtest3 method 1");
	}
	
	@Test
	public void classtest3_2()
	{
		System.out.println("classtest3 method 2");
	}
	
	@Test(dataProvider = "credentials")
	public void classtest3_3(String uname, String pwd)
	{
		System.out.println("classtest3 method 3:- username is " +uname +" and password is "+ pwd);
	}
	
	@AfterSuite()
	public void afterSuite()
	{
		System.out.println("After Suite -> runs after suite");
	}

	@DataProvider(name = "credentials")
	public Object[][] dp()
	{
		Object[][] d = new Object[2][2];
		d[0][0] = "test1@test.cm";
		d[0][1] = "pwd1";
		
		d[1][0] = "test2@test.cm";
		d[1][1] = "pwd2";
		
		return d;
	}

}
