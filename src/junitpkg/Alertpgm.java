package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/nayan/OneDrive/Documents/javapgm/alert.html");
	}
	@Test
	public void page()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println("alert text="+text);
		a.accept();
		driver.findElement(By.name("firstname")).sendKeys("nayana");
		driver.findElement(By.name("lastname")).sendKeys("nayana23");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
}
