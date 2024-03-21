package j_unit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_Rediff_Login {

WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("SNEHA E");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("snehamithun@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("nena@10123");
		
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("nena@10123");
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("mithun@outlook.com");
		//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"div_mob\"]/table/tbody/tr/td[3]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"country_id\"]/ul/li[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("7902526188");
		//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
		//driver.findElement(By.xpath("")).click();	
		
	}	

	/*@After
	public void after()
	{
		driver.close();
	}*/
	
}