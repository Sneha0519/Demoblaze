package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C_Cross_Browser {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String s)
	{
		if(s.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(s.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if (s.equalsIgnoreCase("firefox"))
		{
            driver = new FirefoxDriver();
        } else 
        {
            throw new IllegalArgumentException("Invalid browser specified: " + s);
        }
	}
	
	
	@Parameters("search")
	@Test
	public void test(String search)
	{
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("cars",Keys.ENTER);
	}

}
