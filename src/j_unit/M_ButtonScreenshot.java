package j_unit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.io.FileHandler;
	import org.junit.Before;
	import org.junit.Test;
	import java.io.File;
	import java.io.IOException;

	public class M_ButtonScreenshot {

	    WebDriver driver;

	    @Before
	    public void setup() {
	        driver = new EdgeDriver();
	        driver.get("file:///C:/Users/sneha/Desktop/Website.html");
	    }

	    @Test
	    public void test() throws IOException 
	    {
	    	
	      WebElement button = driver.findElement(By.name("firstname")); 
	      File src = button.getScreenshotAs(OutputType.FILE);

	     // FileHandler.copy(src, new File("D:\\ButtonScreenshot.png"));
	      FileHandler.copy(src, new File("./Screenshot/error.png"));
	    
	    }
	}


	


