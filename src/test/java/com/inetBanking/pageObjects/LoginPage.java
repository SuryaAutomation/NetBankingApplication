package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(name ="uid")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement passed;
	
	@FindBy(name ="btnLogin")
	WebElement Loginbtn;
	
	@FindBy(xpath ="/html/body/div[3]/div/ul/li[15]/a")
	WebElement logoutbtn;
	
	
	public void setusername(String user) {
		username.sendKeys(user);
	}
	
	public void setpassword(String pass) {
		passed.sendKeys(pass);
	}
	
	public void clicksubmit() {
		Loginbtn.click();
	}

	public void clickLogout() {
		// TODO Auto-generated method stub
		logoutbtn.click();
		
	}
	
	
	
}
