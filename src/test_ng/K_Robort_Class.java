package test_ng;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class K_Robort_Class {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	
	@Test
	public void test() throws AWTException
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/a/span")).click();
		FileUpload("C:\\Users\\sneha\\Desktop\\2.JUNIT.docx");
	}

	private void FileUpload(String p) throws AWTException {
		// TODO Auto-generated method stub
		
		StringSelection str = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);	
		
		Robot robot = new Robot();
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(3000);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
}
