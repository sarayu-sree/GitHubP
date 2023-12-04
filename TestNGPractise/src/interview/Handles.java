package interview;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Handles {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepti's laptop\\Downloads\\Selenium jars\\chromedriver-win64\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(enabled = false)
	public void alertsTxt()
	{
		
		driver.findElement(By.id("name")).sendKeys("yikes");
		driver.findElement(By.id("alertbtn")).click();
		String alertTxt = driver.switchTo().alert().getText();
		System.out.println(alertTxt);
	}
	
	@Test(enabled = false)
	public void newWindow()
	{
		driver.findElement(By.id("openwindow")).click();
		Set windows = driver.getWindowHandles();
		Iterator<String> i = windows.iterator();
		String parentid = i.next();
		String childid = i.next();
		String currentURL = driver.switchTo().window(childid).getCurrentUrl();
		System.out.println("new url is "+currentURL);
	}
	
	@Test(invocationCount = 4, enabled = false)
	public void newTabs()
	{
		driver.findElement(By.id("opentab")).click();
		String handle1 = driver.getWindowHandle();
		System.out.println(handle1);
		Set tabs = driver.getWindowHandles();
		Iterator<String> i = tabs.iterator();
		String parentTab = i.next();
		String childTab = i.next();
		String currentTab = driver.switchTo().window(childTab).getCurrentUrl();
		System.out.println("new url is "+currentTab);
	}
	
	@Test
	public void webTable()
	{
		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		
		int rowNum = driver.findElements(By.xpath("//table[@name='courses']//tr")).size();
		System.out.println("Number of rows in the table: "+rowNum);
		
		int colNum = driver.findElements(By.xpath("//table[@name='courses']//tr/th")).size();
		System.out.println("Number of columns in the table: "+colNum);
		
			for(int j=1; j<=colNum; j++)
			{
				String colName = driver.findElement(By.xpath("//table[@name='courses']//tr/th["+j+"]")).getText();
			//	System.out.println(colName);

				if(colName.equalsIgnoreCase("Price")) 
				{
					for(int i=2; i<=rowNum ;i++)
					{
						String rowName = driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]/td["+j+"]")).getText();
						System.out.println(rowName);
					}
				}
			}
		
	}
	
	@AfterMethod
	public void breakdown()
	{
		driver.quit();
	}
	
}
