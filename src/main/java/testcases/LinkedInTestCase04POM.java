package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLogin;
import wrappers.LinkedInWrappers;

public class LinkedInTestCase04POM extends LinkedInWrappers{
	
	@Test(dataProvider="fetchData")
	public void TcCw04 (String userName, String passWord, String KeyWord) throws InterruptedException {
		
		new LinkedInLogin()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.VerifyHomePageTitle("Welcome! | LinkedIn")
		.clickJobs()
		.VerifyJobPageTitle("Jobs Home | LinkedIn")
		.enterJobName(KeyWord)
		.clickOnFindJobs()
		.VerifyJobSearchPageTitle("Search | LinkedIn")
		.clickSecondJob()
		.VerifyJobdetailTitle("Technical Specialist Job at HCL Technologies in Madurai, IN | LinkedIn")
		.getCopanyName()
		.clickOnCompanyName()
		.VerifyCompanyPageTitle("HCL Technologies: Careers & Employment | LinkedIn")
		.getComanyEmployeeCount()
		.moveToLogout()
		.clickLogout()
		.verifyLogout("You have signed out");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004";
		browserName="chrome";
		testCaseName="Login to LinkedIn Test Case 4";
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