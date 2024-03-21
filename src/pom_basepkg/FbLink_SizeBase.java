package pom_basepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbLink_SizeBase {
	
	WebDriver driver;
	
	public FbLink_SizeBase(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
		
	}

	public void LinkSize()
	{
		List<WebElement>Li = driver.findElements(By.tagName("a"));
		System.out.println("No.of links : "+Li.size());
	}

}
