package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLogin;
import wrappers.LinkedInWrappers;

public class LinkedInTestCase01POM extends LinkedInWrappers{
	
	@Test(dataProvider="fetchData")
	public void TcCw01 (String userName, String passWord, String KeyWord) throws InterruptedException {
		
		new LinkedInLogin()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		//.VerifyWelcomemsg("SUBRAMANIAN MUTHURAMAN")
		.VerifyHomePageTitle("Welcome! | LinkedIn")
		.clickAdvSearch()
		.verifyAdvancedSearchPage("Advanced People Search")
		.enterSearchKeyWord(KeyWord)
		.clickOnSearchButton()
		.getSearchResults()
		.getFirstConnectionName()
		.getConnectionType()
		.moveToLogout()
		.clickLogout()
		.verifyLogout("You have signed out");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC001";
		browserName="chrome";
		testCaseName="Login to LinkedIn";
		testDescription="Test Case 1 in LinkedIn using POM framework";
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