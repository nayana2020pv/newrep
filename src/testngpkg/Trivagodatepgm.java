package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivagodatepgm {
	
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		
	}
	
	@Test
	public void datepgm()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div/div[2]/div/div/button[1]/span")).click();
		datecheckin("December 2024","23");
		datecheckout("December 2024","26");
	}

	private void datecheckin(String expmonth, String expdate) {
		
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
			System.out.println("month"+month);
			if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button[2]/span/span/svg")).click();
			}
		}
		     
			List<WebElement> date=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
			for(WebElement d:date)
			{
				String dateText=d.getText();
				if(dateText.equals(expdate))
				{
					d.click();
					break;
				}
			}
		}
		
		
	

	private void datecheckout(String expmonth1, String expdate1) {
		while(true)
		{
			String month1=driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div/div[2]/div/div[1]/button[2]/span")).getText();
			System.out.println("month"+month1);
			if(month1.equals(expmonth1))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
			}
		}	
			List<WebElement> date=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr/td/span"));
			for(WebElement d:date)
			{
				String dateText1=d.getText();
				if(dateText1.equals(expdate1))
				{
					d.click();
					break;
				}
			}
		}
		
	}


