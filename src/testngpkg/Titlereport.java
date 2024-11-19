package testngpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
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
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Titlereport {
	WebDriver driver;
    ExtentSparkReporter report;
    ExtentTest test;
    ExtentReports extent;
    
	
	@BeforeTest
	public void beftest()
	{
		report=new ExtentSparkReporter("./Reports/myreport1.html");
		report.config().setDocumentTitle("AutomationReport");
		report.config().setReportName("functional test");
		report.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testrname", "abc");
		extent.setSystemInfo("Brower name", "chrome");
		
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void setup()
	{
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void titileverification()
	{
		test=extent.createTest("titileverification");
		String exp="facebook";
		String act=driver.getTitle();
		Assert.assertEquals(exp, act);
	}
	
	
	@AfterTest
	
	public void teardown()
	{
		extent.flush();
	}
	@AfterMethod
	
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,"test case failes is"+result.getName());
			test.log(Status.SKIP,"test case failes is"+result.getThrowable());
			String screenshotpath=screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,"test case skipped is"+result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,"test case skipped is"+result.getName());
			
		}
	}

	private String screenshotMethod(WebDriver driver, String screenshotname) throws IOException {
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String des="./Screenshot/"+screenshotname+".jpeg";
		FileHandler.copy(s, new File(des));
		
		
		return des;
	}
	
	

}
