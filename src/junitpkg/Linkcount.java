package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	
	@Before
	
	public void begin()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void log()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("count="+li.size());
		
		for(WebElement Link:li)
		{
			
			System.out.println(Link.getText());
		}
		
		
	}
	
	@After
	public void sop()
	{
		driver.quit();
	}

}
