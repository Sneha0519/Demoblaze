package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@Parameters("searchvalue")
	@Test
	public void test(String s)
	{
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);
	}
}
