package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readConfig =new ReadConfig();
public String url = readConfig.setApplicationUrl();
public String uname =readConfig.getusername();
public String passd =readConfig.getpassword();
public static WebDriver driver;
public String title=readConfig.gettitle();
public static Logger logger;

@Parameters("browser")
@BeforeClass
public void setup(String br) {
	
	if(br.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver",readConfig.getchrome());
	//driver =new FirefoxDriver();
	driver =new ChromeDriver();
	}
	else if(br.equals("firefox")){
		System.setProperty("webdriver.gecko.driver",readConfig.getfirefo());
		driver =new FirefoxDriver();
	}
	
	logger=Logger.getLogger("ebanking");
	PropertyConfigurator.configure("log4j.properties");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(url);
	driver.manage().window().maximize();
}

@AfterClass
public void teardown() {
	driver.quit();
}

public void captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}
public String randomestring()
{
	String generatedstring=RandomStringUtils.randomAlphabetic(8);
	return(generatedstring);
}

public static String randomeNum() {
	String generatedString2 = RandomStringUtils.randomNumeric(4);
	return (generatedString2);
}

}
