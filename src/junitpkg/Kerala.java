package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kerala {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("ulogin")).sendKeys("nayana");
		driver.findElement(By.id("upass")).sendKeys("678905");
		driver.findElement(By.id("sub_logbtn")).click();
	}
	
	@After
	public void down()
	{
		driver.quit();
	}

}
