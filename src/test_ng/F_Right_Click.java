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

public class F_Right_Click {

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
		
		WebElement right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));	
		
		Actions act = new Actions(driver);
		act.contextClick(right);
		act.perform();	
		
		WebElement select = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[2]/span"));
		select.click();
		Alert a = driver.switchTo().alert();
		a.accept();
	
	}
	
}
