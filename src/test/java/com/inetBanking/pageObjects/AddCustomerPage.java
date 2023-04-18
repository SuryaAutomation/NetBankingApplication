package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
@FindBy(how=How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
WebElement lnkAddnewcustomer;

@FindBy(how=How.NAME, using="name")
WebElement txtCustomername;

@FindBy(how=How.NAME, using="rad1")
WebElement rdGender;

@FindBy(how=How.ID_OR_NAME, using="dob")
WebElement txtdob;


@FindBy(how=How.NAME, using="addr")
WebElement txtaddress;

@FindBy(how=How.NAME, using="city")
WebElement txtcity;

@FindBy(how=How.NAME, using="state")
WebElement txtstate;


@FindBy(how=How.NAME, using="pinno")
WebElement txtpin;

@FindBy(how=How.NAME, using="telephoneno")
WebElement txtmobile;

@FindBy(how=How.NAME, using="emailid")
WebElement txtemailid;

@FindBy(how=How.NAME, using="password")
WebElement txtpassword;

@FindBy(how=How.NAME, using="sub")
WebElement btnsub;

public void NewCustomerName(String newname) {
	txtCustomername.sendKeys(newname);
}

public void linkNewCustomer() {
	lnkAddnewcustomer.click();
}

public void CustomerGender(String cusgender) {
	rdGender.click();
}

public void Customerdob(String mm,String dd, String yy) {
	txtdob.sendKeys(mm);
	txtdob.sendKeys(dd);
	txtdob.sendKeys(yy);
	
}

public void CustomerAddress(String cusadd) {
	txtaddress.sendKeys(cusadd);
}

public void CustomerCity(String cuscity) {
	txtcity.sendKeys(cuscity);
}
public void CustomerState(String cusstate) {
	txtstate.sendKeys(cusstate);
}

public void CustomerPin(String cuspin) {
	txtpin.sendKeys(cuspin);
}

public void Customernumber(String cusmob) {
	txtmobile.sendKeys(cusmob);
}

public void CustomerEmail(String cusemail) {
	txtemailid.sendKeys(cusemail);
}

public void CustomerPassword(String cuspass) {
	txtpassword.sendKeys(cuspass);
}

public void CustomerSubmit() {
	btnsub.click();
}
}


