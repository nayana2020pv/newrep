package Test;

import org.testng.annotations.Test;

import page.Fbcreatepgm;

public class Fbcreatetest extends Baseclass {
	
	@Test
	
	public void createpagetest()
	{
		Fbcreatepgm ob=new Fbcreatepgm(driver);
		ob.log();
		ob.textverification();
		ob.login();
	}
	
	

}
