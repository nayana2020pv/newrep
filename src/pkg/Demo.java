package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	         
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String acttitle=driver.getTitle();
		String exptitle="Google";
		System.out.println(acttitle.equals(exptitle));
		
		driver.quit();

	}

}
