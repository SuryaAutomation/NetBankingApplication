package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src =new File("./Configuration/Config.properties");
		try {
			FileInputStream fis =new FileInputStream(src);
			pro =new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
		
		
	}

	public String setApplicationUrl() {
		String baseurl =pro.getProperty("url");
		return baseurl;
	}
	public String getusername() {
		String name =pro.getProperty("uname");
		return name;
	}
	
	public String getpassword() {
		String passcode =pro.getProperty("passd");
		return passcode;
	}
	public String getchrome() {
		String chrome =pro.getProperty("chromepath");
		return chrome;
	}
	public String getfirefo() {
		String firefox =pro.getProperty("firefoxpath");
		return firefox;
	}
	public String gettitle() {
		String pagetitle =pro.getProperty("title");
		return pagetitle;
	}
}
