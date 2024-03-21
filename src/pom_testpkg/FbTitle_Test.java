package pom_testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FbTitle_Test {
	
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
		pom_basepkg.FbTitle_Base obj = new pom_basepkg.FbTitle_Base(driver);
		obj.compare();
	}

}
