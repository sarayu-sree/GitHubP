package practise;

import org.testng.annotations.*;

public class AttributesTest {

	@Test(priority = 300)
	public void login()
	{
		System.out.println("Login method");
	}
	
	@Test(priority = 3000)
	public void test1()
	{
		System.out.println("depends");
	}

	@Test(dependsOnMethods = {"login"})
	public void logoutw()
	{
		System.out.println("Logout method");
	}
	
	@Test(dependsOnMethods = {"login"})
	public void logout1()
	{
		System.out.println("dashboard method");
	}
	

}
