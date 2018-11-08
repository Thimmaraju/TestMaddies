package com.Winwire.MaddiesFund.Helper.BrowerConfiguration.config;

import com.Winwire.MaddiesFund.Helper.BrowerConfiguration.BrowserType;

public interface ConfigReader {
	
	public int getImpliciteWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();
	public String getUrl();
	public String getUserName();
	public String getPassword();

}
