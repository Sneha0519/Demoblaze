package test_ng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class G_DoubleClick {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void test()
	{

		WebElement dble = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act = new Actions(driver);
		act.doubleClick(dble);
		act.perform();
		
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
}
