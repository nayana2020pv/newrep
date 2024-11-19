package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {
	ChromeDriver driver;
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("nayana");
		driver.findElement(By.id("last-name")).sendKeys("pv");
		driver.findElement(By.id("postal-code")).sendKeys("456867");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
	}
	/*@After
	public void stop()
	{
		driver.quit();
	}*/

}
