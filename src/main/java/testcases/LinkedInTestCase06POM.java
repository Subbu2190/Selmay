package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLogin;
import wrappers.LinkedInWrappers;

public class LinkedInTestCase06POM extends LinkedInWrappers{
	
	@Test(dataProvider="fetchData")
	public void TcCw01 (String userName, String passWord) throws InterruptedException {
		
		new LinkedInLogin()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		//.VerifyWelcomemsg("SUBRAMANIAN MUTHURAMAN")
		.VerifyHomePageTitle("Welcome! | LinkedIn")
		.clickOnMessageIcon()
		.clickOnNewMessage()
		.enterContactName("Kamala M")
		.enterMessageContent("Hi Hw r u")
		.clickOnEnterCheckBox()
		.clickOnSendMessage();
		
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="Login to LinkedIn";
		testDescription="Test Case 5 in LinkedIn using POM framework";
	}

}



/*
verifySearchPage("Advanced People Search")
.enterKeyWord(KeyWord)
.clickSubmit()
//.countSearchResults()
.firstConName()
.connectiontype()
.clickLogout()
.verifyLogout("You have signed out");
*/