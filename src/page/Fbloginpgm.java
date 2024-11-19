package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpgm {
	
	WebDriver driver;
	
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	public Fbloginpgm(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void values(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
	}
	public void log()
	{
		driver.findElement(fblogin).click();
	}

}
