package testngpkg;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowdetails {
	WebDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	
	public void test()
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("Title of google"+driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		
		driver.switchTo().window(parentwindow);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ebay.com");
		System.out.println(driver.getTitle());
		
		ArrayList<String> windowdetail=new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(windowdetail.get(1));
		System.out.println(driver.getTitle());
	}
}