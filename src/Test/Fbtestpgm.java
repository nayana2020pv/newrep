package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpgm;

public class Fbtestpgm {
	
	WebDriver driver;
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	
	public void testlog()
	{
		Fbloginpgm ob=new Fbloginpgm(driver);
		ob.values("nayana@gmail.com","Bnm23456");
		ob.log();
	}
	

}
