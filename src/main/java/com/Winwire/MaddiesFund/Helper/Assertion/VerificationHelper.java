package com.Winwire.MaddiesFund.Helper.Assertion;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Winwire.MaddiesFund.Helper.Logger.loggerHelper;

public class VerificationHelper {
	
	private WebDriver driver;
	private Logger log = loggerHelper.getLogger(VerificationHelper.class);
	
	public VerificationHelper(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean isDisplayed(WebElement element){
		
		try {
		  
			element.isDisplayed();
			log.info("element is present.."+element.getText());
			return true;
		}
		
		catch(Exception e){
				
			log.error("element is not prsent..",e.getCause());
			return false;
		}
	}
	
    public boolean isNotDisplayed(WebElement element){
		
		try {
		  
			element.isDisplayed();
			log.info("element is present.."+element.getText());
			return false;
		}
		
		catch(Exception e){
				
			log.error("element is not prsent..");
			return true;
		}
	}
    
    public String reaValueFromElement(WebElement element){
    	
    	if(null == element){
    		
    		log.info("WebElement is null ..");
    		return null;
     		
    	}
    	boolean status = isDisplayed(element);
    	if(status){
    		log.info("element text is .."+element.getText());
    		return element.getText();
    	}
    	else {
    		return null;
    	}
    }
}
