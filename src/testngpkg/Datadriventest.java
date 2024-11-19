package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	
	@Test
	
	public void log() throws Exception
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\nayan\\OneDrive\\Documents\\Book1k.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int r=sh.getLastRowNum();
		for(int i=1;i<=r;i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			String pass=sh.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.id("ulogin")).sendKeys(email);
			driver.findElement(By.id("upass")).sendKeys(pass);
			driver.findElement(By.id("sub_logbtn")).click();
			driver.navigate().refresh();
			
			Thread.sleep(3000);
				
		}
		
		
		
		String exp="https://keralaproperty.in/member/myhome/";
		String url=driver.getCurrentUrl();
		
		if(url.equals(url))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
