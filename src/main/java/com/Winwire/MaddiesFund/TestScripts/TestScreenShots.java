package com.Winwire.MaddiesFund.TestScripts;

import org.testng.annotations.Test;

import com.Winwire.MaddiesFund.TestBase.TestBase;

public class TestScreenShots extends TestBase {

	@Test
	public void testScreen() {
		driver.get("https://www.seleniumhq.org/download/");
		captureScreen("FirstScreeenShot", driver);
	}

}
