package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLogin;
import wrappers.LinkedInWrappers;

public class Week6Day1CW extends LinkedInWrappers{
	
	@Test(dataProvider="fetchData")
	public void TcCw01 (String userName, String passWord) throws InterruptedException {
		
		new LinkedInLogin()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.VerifyWelcomemsg("SUBRAMANIAN MUTHURAMAN");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC001";
		browserName="chrome";
		testCaseName="Login to LinkedIn";
		testDescription="Login and Logout in LinkedIn using POM framework";
	}

}
