package pom_testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	
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
	public void testlogin()
	{
		pom_basepkg.PageClass ob = new pom_basepkg.PageClass(driver);
		ob.setvalues("abc@123", "1234");
		ob.login();
	}
	
}
