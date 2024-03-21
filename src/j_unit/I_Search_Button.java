package j_unit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Search_Button {
WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test()
	{
	
	driver.findElement(By.name("q")).sendKeys("car",Keys.ENTER);
	}
	/*@After
	public void after()
	{
		driver.close();
	}*/

}
