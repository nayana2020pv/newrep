package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Keralaestatepgm {
	ChromeDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	
	@Test
	public void log()
	{
		driver.findElement(By.id("ulogin")).sendKeys("nayana8202@gmail.com");
		driver.findElement(By.id("upass")).sendKeys("12345678");
		driver.findElement(By.id("sub_logbtn")).click();
		String exp="https://keralaproperty.in/member/myhome/";
		String url=driver.getCurrentUrl();
		
		if(url.equals(url))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
