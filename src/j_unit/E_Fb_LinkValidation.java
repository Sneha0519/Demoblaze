package j_unit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_Fb_LinkValidation {
	
	WebDriver driver;
	String baseurl = "https://www.facebook.com";
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test() throws IOException
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : "+li.size());
		
		for(WebElement element: li)
		{
			String linkdetails = element.getAttribute("href");
			verify(linkdetails);
		}
	}

	private void verify(String linkdetails) throws IOException {
		// TODO Auto-generated method stub
		
		try
		{
		URL u = new URL(linkdetails);
		HttpURLConnection con = (HttpURLConnection) u.openConnection();
		con.connect();
		
		if(con.getResponseCode()==200)
		{
			System.out.println("Status code is 200 : "+linkdetails);
		}
		
		else
		{
			System.out.println("Status code is 400 : "+linkdetails);
		}
		
	}
	
	catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}	
