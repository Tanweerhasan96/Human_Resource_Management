package PracticeMaven;

import org.testng.annotations.Test;

public class Login 
{
	@Test
	public void loginApp()
	{
		String browser = System.getProperty("browser");
		String url  =   System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

} 
