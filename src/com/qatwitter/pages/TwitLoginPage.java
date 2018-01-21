package com.qatwitter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TwitLoginPage {
	

	
	@FindBy(xpath="//*[@id='user_login']")
	public WebElement username;
	
	@FindBy(how = How.XPATH, using = "//*[@id='user_pass']")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id='wp-submit']")
	public WebElement secondLoginBtn;
	
	
	
	public void doLogin(String myusername,String mypassword)
	{
		username.sendKeys(myusername);
		password.sendKeys(mypassword);
		secondLoginBtn.click();
	}
	
	
	
	
	
}
