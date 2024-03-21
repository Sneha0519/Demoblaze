package pom_testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom_basepkg.Rediff_LogoBase;

public class Rediff_LogoTest {
	
	WebDriver driver;
	String baseurl = "https://register.rediff.com/register/register.php?FormName=user_details";
	
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
		Rediff_LogoBase obj = new Rediff_LogoBase(driver);
		obj.logo();
	}
}
