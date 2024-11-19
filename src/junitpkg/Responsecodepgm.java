package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class Responsecodepgm {
	
	String l="https://www.google.com";
	@Test
	
	public void setup() throws Exception
	{
		URI ob=new URI(l);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		int code=con.getResponseCode();
		System.out.println("resposecode:"+code);
	}
	

}
