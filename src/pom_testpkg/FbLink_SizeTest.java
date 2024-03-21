package pom_testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom_basepkg.FbLink_SizeBase;

public class FbLink_SizeTest {
	
	WebDriver driver;
	String baseurl = "https://www.facebook.com/";
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		FbLink_SizeBase obj = new FbLink_SizeBase(driver);
		obj.LinkSize();
	}
	
	
}
