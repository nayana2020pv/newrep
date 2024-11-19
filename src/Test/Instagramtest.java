package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Istagarampgm;

public class Instagramtest {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
	}
	
	@Test
	
	public void logintest()
	{
		Istagarampgm ob=new Istagarampgm(driver);
		ob.values("nayanaprakashan","hchc455");
		ob.login();
	}

}
