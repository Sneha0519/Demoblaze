package j_unit;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class L_Html_Screenshot {

WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new EdgeDriver();
		driver.get("file:///C:/Users/sneha/Desktop/Website.html");
	}
	
	@Test
	public void test() throws IOException	
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(src,new File("D:\\Screenshot.png"));
	}
}
