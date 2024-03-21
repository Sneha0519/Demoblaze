package j_unit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class B_Web_Driver {

	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("snehamithun123");
		driver.findElement(By.name("login")).click();
	}
	
	/*@After
	public void after()
	{
		driver.close();
	}*/
}


