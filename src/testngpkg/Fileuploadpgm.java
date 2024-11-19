package testngpkg;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm {
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
	
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("\"C:\\Users\\nayan\\Downloads\\CV Nayana P V.pdf\"");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		String text=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
		if(text.equalsIgnoreCase("Submit"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}
	

}
