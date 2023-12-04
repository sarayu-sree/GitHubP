package practise;

import org.testng.annotations.*;

public class Class1 {

	@AfterTest
	public void afterTest()
	{
		System.out.println("In After Test");
	}
	
	
	@Test(groups= {"Regression"})
	public void demo1()
	{
		System.out.println("In first demo class");
	}
	
	@Test
	public void demo2()
	{
		System.out.println("In second demo class");
	}
	
	@Test(dataProvider = "credentials")
	public void demo3(String email, String pwd)
	{
		System.out.println("In third demo class");
		System.out.println(email);
		System.out.println(pwd);
	}

	@DataProvider(name ="credentials")
	public Object[][] loginDetails()
	{
		Object[][] d = new Object[2][2];
		
		d[0][0] = "1@testmail1.com";
		d[0][1] = "pwd1";
		
		d[1][0] = "2@testmail.com";
		d[1][1] = "pwd2";
		
		return d;
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("In Before Test");
	}
	
	
}
