package pom_testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom_basepkg.Amazon_Base;
import pom_testpkg.Amazon_Test;

public class Amazon_Test {
	
	WebDriver driver;
	
	//String baseurl = "https://www.amazon.in/";
	String baseurl = "https://www.amazon.in";
	
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
		Amazon_Base obj = new Amazon_Base(driver);
		obj.setvalues("mobiles");
		obj.set();
		obj.email("sneha@gmail.com");
		obj.button();
	
	}
}
