package com.Winwire.MaddiesFund.Helper.Logger;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.Winwire.MaddiesFund.Helper.resource.ResourceHelper;


public class loggerHelper {

	private static boolean root=false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return  Logger.getLogger(cls);
		}
		PropertyConfigurator.configure(ResourceHelper.getResourcePath("src/main/resources/configfile/log4j.properties"));
		root = true;
		return Logger.getLogger(cls);
	}
	
	public static void main(String[] args) {
		Logger log = loggerHelper.getLogger(loggerHelper.class);
		log.info("logger is configured");
		log.info("logger is configured");
		log.info("logger is configured");
		
	}
}