package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc {

	public static void main(String[] args) {
		String baseurl="https://www.google.com";
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String s1=driver.getPageSource();
		if(s1.contains("Gmail"))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("failed");
		}
		
		driver.quit();

	}

}
