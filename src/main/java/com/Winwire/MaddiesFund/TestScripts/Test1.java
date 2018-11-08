package com.Winwire.MaddiesFund.TestScripts;
import org.testng.annotations.Test;

import com.Winwire.MaddiesFund.Helper.Assertion.AssertionHelper;
import com.Winwire.MaddiesFund.TestBase.TestBase1;


public class Test1 extends TestBase1{

	
	@Test
	public void testLogin(){
		AssertionHelper.markPass();
	}
	
	@Test
	public void testLogin1(){
		AssertionHelper.markFail();
	}
	
	@Test
	public void testLogin2(){
		AssertionHelper.markPass();
	}
	
	@Test
	public void testLogin3(){
		AssertionHelper.markFail();
	}
}
