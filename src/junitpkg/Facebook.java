package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("nayanapv20202gmail.com");
		driver.findElement(By.id("pass")).sendKeys("235253");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void down()
	{
		driver.quit();
	}

}
