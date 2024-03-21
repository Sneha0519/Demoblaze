package pom_basepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Rediff_LogoBase {
	
	WebDriver driver;
	
	public Rediff_LogoBase(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
		
	}

	public void logo()
	{
		boolean logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("Logo is visible");
		}
		
		else
		{
			System.out.println("Logo is not visible");
		}
	
	}
}

