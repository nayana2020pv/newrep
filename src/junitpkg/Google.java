package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	ChromeDriver driver;
	
	@Before
	public void begin()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	
	public void search()
	{
		WebElement searchf=driver.findElement(By.name("q"));
		searchf.sendKeys("books",Keys.ENTER);
	}

}
