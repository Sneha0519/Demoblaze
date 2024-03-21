package j_unit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class K_Html_PopUp {
	

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
		
		//a.dismiss();
		
		String text = a.getText();
		String exp = "Hello i'm an alert box!!";
		
		if(text.equals(exp))
		{
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
		}
		
		a.accept();
		
		//driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("SNEHA");
		//driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("MITHUN");
		//driver.findElement(By.xpath("/html/body/input[4]")).click();
	}		
	
}
