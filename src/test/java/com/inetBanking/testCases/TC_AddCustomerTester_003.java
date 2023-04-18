package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomerTester_003 extends BaseClass {
	
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setusername(uname);
		lp.setpassword(passd);
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcus=new AddCustomerPage(driver);
		addcus.linkNewCustomer();
		addcus.NewCustomerName("Surya");
		addcus.CustomerGender("male");
		addcus.Customerdob("10","15","1985");
		Thread.sleep(5000);
		addcus.CustomerAddress("INDIA");
		addcus.CustomerCity("HYD");
		addcus.CustomerState("AP");
		addcus.CustomerPin("5000074");
		addcus.Customernumber("987890091");
		Thread.sleep(3000);
		String email=randomestring()+"@gmail.com";
		addcus.CustomerEmail(email);
		addcus.CustomerPassword("abcdef");
		addcus.CustomerSubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}
	
	

	}


