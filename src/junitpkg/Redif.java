package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redif {
	
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void serach()
	{
		List<WebElement>  li=driver.findElements(By.tagName("a"));
		System.out.println("count="+li.size());
		//System.out.println(count);
		
		if(li.size()==30)
		{
			System.out.println("Expectation is correct");
		}
		else
		{
			System.out.println("total link"+li.size());
		}
		
		if(driver.getPageSource().contains("Create a Rediffmail account"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not prsent");
		}
		WebElement logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
		boolean l=logo.isDisplayed();
		if(l)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		
		WebElement bu=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]"));
		boolean l1=bu.isSelected();
		if(l1)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
	}
	

}
