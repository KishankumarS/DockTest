package com.doit;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.Home;
import com.repository.Wd;
import com.repository.Common;
import com.repository.GetBrowser;

public class Runner1 {

	Common comm = new Common();
	Home homepage = new Home();
	
	private Wd command = new Wd();	

	@Parameters("browser")
	@BeforeClass
	public void initiateBrowser(String browser) {
		GetBrowser gb = new GetBrowser();
		command.setDriver(gb.getBrowser(browser));
	}
	
	@Test
	public void testCase1() {	
		command.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	getfun.waitfor(homepage.addItemInbox(command.getDriver()),command.getDriver());
		String fieldvalue = homepage.addItemInbox(command.getDriver()).getAttribute("value");
		/*Actions act = new Actions(command.getDriver());
		act.clickAndHold(homepage.addItemInbox(command.getDriver())).
		moveToElement(homepage.addItemInbox(command.getDriver())).
		release(homepage.addItemInbox(command.getDriver())).
		build().perform();*/
		
		System.out.println(fieldvalue);

	}
	
	@Test
	public void testCase2() {	
		command.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		homepage.clickSpecial(command.getDriver());
		comm.takeScreenshot(command.getDriver(), "InsideTest2");
	}
	
	@AfterMethod
	public void takescreenshot(ITestResult result) {
		if(!result.isSuccess()) {
			comm.takeScreenshot(command.getDriver(), result.getName()+"_OnFailure");
		}
	}
	
	@AfterClass
	public void after() {
		command.getDriver().quit();
		command.setDriver(null);
	}

	
}
