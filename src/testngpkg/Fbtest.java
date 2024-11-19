package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbtest {
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
	@Test(groups="sanity")
	public void test1()
	{
		driver.findElement(By.id("email")).sendKeys("nayanapv20202gmail.com");
		driver.findElement(By.id("pass")).sendKeys("235253");
		driver.findElement(By.name("login")).click();
	}
	@Test(groups= {"smoke","sanity"})
	public void test2()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("count="+li.size());
	}
	@Test
	public void test3()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div/img"));
		boolean l=logo.isDisplayed();
		if(l)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}

}
