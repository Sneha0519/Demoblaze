package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E_Drag_Drop {
	

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag,drop);
		act.perform();
		
		String text =drop.getText();
		if(text.equalsIgnoreCase("dropped!"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test failed");
		}	
	}

}
