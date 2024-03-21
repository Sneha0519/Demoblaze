package test_ng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class M_Extended_Report {
	
	WebDriver driver;
	String Baseurl = "https://www.facebook.com";
	
	ExtentHtmlReporter reporter; // look& Design 
	ExtentTest test; // Updations
	ExtentReports extent; //Add new Entries - Tester name/ Environment Details Add
	
	@BeforeTest
	public void beforetest()
	{
	reporter = new ExtentHtmlReporter("./D:\\Sneha\\Luminar works\".html"); //location pass - Parameter through
	reporter.config().setDocumentTitle("Automation");
	
	reporter.config().setReportName("Functional Test");
	reporter.config().setTheme(Theme.DARK);//Add new entry / write 
	
	extent= new ExtentReports();
	extent.attachReporter(reporter); //add -- Report details
	
	extent.setSystemInfo("Hostname", "Local Host");
	extent.setSystemInfo("OS", "Windows10");
	
	extent.setSystemInfo("Tester name", "abc");
	extent.setSystemInfo("Browsername", "Chrome");
	driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
	driver.get(Baseurl);
	}
	
	@Test
	public void fbtitleverification()
	{
	test=extent.createTest("fbtitleverification");
	String exp="facebook";
	String actual=driver.getTitle();
	Assert.assertEquals(exp, actual);
	}
	
	@Test
	public void logo()
	{
	test=extent.createTest("logo");
	boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
	Assert.assertTrue(b);
	}
	
	@AfterTest
	public void teardown()
	{
	extent.flush(); //input -- read
	}
	
	@AfterMethod
	public void browserclose(ITestResult result)throws IOException //ittestresult(listener) - reporting use 
	{
	
		if(result.getStatus()==ITestResult.FAILURE) //fbttile verification
		{
			test.log(Status.FAIL,"test case failed is"+result.getName()); //previous method name
			test.log(Status.FAIL,"test case failed is"+result.getThrowable()); //reason
			//String screenshotpath=Extentreports.screenshotMethod(driver,result.getName());
			//test.addScreenCaptureFormPath(screenshotpath);
		}
	
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case is skipped"+result.getName());
		}
	
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case is passed"+result.getName());
		}
      }
  }

