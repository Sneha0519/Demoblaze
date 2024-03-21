package pom_basepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom_basepkg.Amazon_Base;

public class Amazon_Base 
{
	
	WebDriver driver;
	
	By searchfield = By.id("twotabsearchtextbox");
	By signin = By.id("nav-link-accountList");
	By emailid = By.name("email");
	By button = By.xpath("//*[@id=\"continue\"]");
	
	public Amazon_Base(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
		
	}
	
	public void setvalues(String twotabsearchtextbox)
	{
		driver.findElement(searchfield).sendKeys(twotabsearchtextbox);
	}
	
	public void set()
	{
		driver.findElement(signin).click();
	}
	
	public void email(String email)
	{
		driver.findElement(emailid).sendKeys(email);
	}

	public void button()
	{
		driver.findElement(button).click();
	}
		

}
