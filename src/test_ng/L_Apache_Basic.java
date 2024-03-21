package test_ng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class L_Apache_Basic {

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() throws IOException 
	{
		FileInputStream f = new FileInputStream("C:\\Users\\sneha\\Desktop");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet sh = wb.getSheet("fb login");
		
		int rowcount = sh.getLastRowNum();
		for(int i=1; i<=rowcount; i++)
		{
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username = "+username);
			
			String password = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password = "+password);
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys("username");
			driver.findElement(By.name("pass")).sendKeys("password");
			driver.findElement(By.name("login")).click();
		}
	}
}
