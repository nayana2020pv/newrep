package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titileverification()
	{
		String act=driver.getTitle();
		String exp="Google";
		if(act.equals(exp))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("failed");
		}
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
