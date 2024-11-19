package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterpgm {
	@Parameters("s")
	@Test
     public void test(String s)
     {
		System.out.println(s);
     }
}
