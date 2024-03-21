package j_unit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_Amazon_Login {
	
WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("western wears");
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("snehamithun@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		//WebElement female = driver.findElement(""));//radio button
		//WebElement male = driver.findElement(""));//radio button
		//fmale.click();
		
		//driver.manage().window().maximize();
		
		
	}
	
	/*@After
	public void after()
	{
		driver.close();
	}*/
	
}
