package j_unit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class J_Website_Html {

WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new EdgeDriver();
		driver.get("file:///C:/Users/sneha/Desktop/Website.html");
	}
	
	@Test
	public void test()	
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		//a.dismiss();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("SNEHA");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("MITHUN");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}
	
	
}
