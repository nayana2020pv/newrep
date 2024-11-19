package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Fbcreatepgm {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement fbclick;
	
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement fbsignup;
	
	public Fbcreatepgm(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void textverification()
	{
		if(driver.getPageSource().contains("Create a Page"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not prsent");
		}
	}
	
	public void log()
	{
		fbclick.click();
	
	}
	public void login()
	{
		fbsignup.click();
	}
	

}
