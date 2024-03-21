package basepkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class C_Content_Verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String source = driver.getPageSource();
		String exp = "Gmail";
		
		if(source.contains(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
