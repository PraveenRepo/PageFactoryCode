package com.qatwittter.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qatwitter.pages.TwitLoginPage;

public class VerifyTwitLoginPage {
	
	public static WebDriver driver;
	public static TwitLoginPage lp;
	
	
	@Test
	public void verifyValidTwitLoginpage() {
		
		driver=new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		 lp = PageFactory.initElements(driver, TwitLoginPage.class);
		lp.doLogin("admin", "demo123");
		
	}
	
/*	@Test
	public void verifyValidTwitLoginpage()
	{
		TwitLoginPage lp = new TwitLoginPage();
		lp.doLogin("praveen.seleniumautomation@gmail.com", "Test@123");
		
				
	}
*/
}
