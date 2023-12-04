package excelDataProvider;

import org.testng.annotations.*;

public class DataProviderTest extends ExcelDataReader{
	
	
	@Test(dataProvider = "credentials")
	public void test(String username, String password)
	{
		System.out.print(username);
		System.out.print(" | ");
		System.out.print(password);
		System.out.println();
	}
}
