package test_ng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_Base_Prgm {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		//browser open
	}
	
	@BeforeMethod
	public void url()
	{
		//url loading
	}
	
	@Test
	public void test()
	{
		//testing activity
	}
	
	@AfterMethod
	public void report()
	{
		//report generation
	}
	
	@AfterTest
	public void browserquite()
	{
		//browser close
	}
}
