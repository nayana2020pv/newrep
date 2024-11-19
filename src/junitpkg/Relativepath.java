package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativepath {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void log()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nayanapv20202gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("235253");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@After
	public void stop()
	{
		driver.quit();
	}
	

}
