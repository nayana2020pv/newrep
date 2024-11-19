package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Istagarampgm {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div[1]/div/label")
	WebElement user;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div[2]/div/label/input")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div[3]")
	WebElement login;
	public Istagarampgm(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void values(String username,String password )
	{
		user.sendKeys(username);
		pass.sendKeys(password);
	}
	public void login()
	{
		login.click();
	}

}
