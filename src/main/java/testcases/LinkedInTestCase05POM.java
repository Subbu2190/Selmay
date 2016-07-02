package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLogin;
import wrappers.LinkedInWrappers;

public class LinkedInTestCase05POM extends LinkedInWrappers{
	
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
		.enterCompanyName("Accenture")
		.selectLocation("Located in or near:")
		.selectCountry("India")
		.clickReset()
		.clickFirstConections()
		.clickOnSearchButton();
		
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="Chrome";
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