package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Infopark {

	public static void main(String[] args) {
		String s1="https://www.wikipedia.com";
		ChromeDriver driver=new ChromeDriver();
		driver.get(s1);
		String acttitle=driver.getTitle();
		String exptitle="Wikipedia";
		//System.out.println(acttitle.equals(exptitle));
		if(acttitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("failed");
		}
		String s2=driver.getPageSource();
		if(s2.contains("Wikibooks"))
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
