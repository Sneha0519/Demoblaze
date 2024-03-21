package test_ng;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class J_AutoIt_wordPdf {

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	
	@Test
	public void test() throws IOException 
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/a/span")).click();
		Runtime.getRuntime().exec("C:\\Users\\sneha\\Desktop\\file2.exe");
	}
}
