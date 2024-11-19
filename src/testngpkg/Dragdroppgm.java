package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdroppgm {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		WebElement d=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement e=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act=new Actions(driver);
		act.moveToElement(d).perform();
		act.doubleClick(d).perform();
		act.dragAndDrop(d, e).perform();
		WebElement a=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.moveToElement(a).perform();
		act.doubleClick(a).perform();
		act.dragAndDrop(a, b).perform();
		
		//credit side
		WebElement c1=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement c2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.moveToElement(c1).perform();
		act.doubleClick(c1).perform();
		act.dragAndDrop(c1, c2).perform();
		
		WebElement c3=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement c4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.moveToElement(c3).perform();
		act.doubleClick(c3).perform();
		act.dragAndDrop(c3, c4).perform();
		
		WebElement p=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		boolean s=p.isDisplayed();
		if(s)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
		
		
	}

}
