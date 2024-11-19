package testngpkg;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebpgm {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	     driver=new ChromeDriver();
	}
	@BeforeMethod
	public void mthd()
	{
		driver.get("https://www.facebook.com");
	}
	@Parameters({"s","s1"})
	@Test
	public void test1(String s,String s1)
	{
		driver.findElement(By.id("email")).sendKeys(s);
		driver.findElement(By.id("pass")).sendKeys(s1);
		driver.findElement(By.name("login")).click();
	}

}
