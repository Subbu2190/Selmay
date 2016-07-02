package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLogin;
import wrappers.LinkedInWrappers;

public class LinkedInTestCase02POM extends LinkedInWrappers{
	
	@Test(dataProvider="fetchData")
	public void TcCw01 (String userName, String passWord) throws InterruptedException {
		
		new LinkedInLogin()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		//.VerifyWelcomemsg("SUBRAMANIAN MUTHURAMAN")
		.VerifyHomePageTitle("Welcome! | LinkedIn")
		.clickAdvSearch()
		.verifyAdvancedSearchPage("Advanced People Search")
		.clickOnClose()
		.closeSecondConnections()
		.closeGroupmembers()
		.getFirstConnectionsTotalCount()
		.getSearchResults()
		.compareSearchResults()
		.moveToLogout()
		.clickLogout()
		.verifyLogout("You have signed out");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC002";
		browserName="chrome";
		testCaseName="Login to LinkedIn Test Case 2";
		testDescription="Test Case 2 in LinkedIn using POM framework";
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