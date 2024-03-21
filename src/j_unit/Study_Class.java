package j_unit;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Study_Class {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/sneha/Desktop/Website.html");
	}
	
	@Test
	public void test() throws IOException
	{
		WebElement button = driver.findElement(By.xpath("/html/body/input[2]"));
		File src = button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot/error.png"));
	}
}
