package pom_basepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbTitle_Base{
	
	
	WebDriver driver;
	By fblogo = By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img");
	
	public FbTitle_Base(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}

	public void compare()
	{
		String exp = "facebook";
		String title = driver.getTitle();
			
		if (exp.equals(title))
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}
}
