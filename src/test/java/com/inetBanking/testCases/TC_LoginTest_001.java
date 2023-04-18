package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void logintest() throws IOException {
		
		driver.get(url);
		logger.info("Url is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setusername(uname);
		logger.info("username entered");
		lp.setpassword(passd);
		logger.info("password entered");
		lp.clicksubmit();
		
		if(driver.getTitle().equals(title)) {
			Assert.assertTrue(true);
			logger.info("logintest passed");

		}
		else {
			captureScreen(driver, "logintest");
			Assert.assertTrue(false);
			logger.info("logintest failed");

		}
	}
	

}
