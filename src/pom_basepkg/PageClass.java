package pom_basepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	
	WebDriver driver;
	
	By fbemail = By.id("email");
	By fbpsswrd = By.id("pass");
	By login = By.name("login");
	
	public PageClass(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public void setvalues(String email, String psswrd)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpsswrd).sendKeys(psswrd);
	}
	
	public void login()
	{
		driver.findElement(login).click();
	}
	
}
