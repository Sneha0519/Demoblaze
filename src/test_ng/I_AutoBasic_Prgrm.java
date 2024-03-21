package test_ng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class I_AutoBasic_Prgrm {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	@Test
	public void test() throws IOException
	{
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/form/div[2]/div[1]/div/div/input")).click();
		Runtime.getRuntime().exec("D:\\Sneha\\Luminar works\\3.SOFTWARE TESTING\\2.AUTOMATION TESTING\\file3.exe");	
	}
}
