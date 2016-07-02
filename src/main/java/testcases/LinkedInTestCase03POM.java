package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLogin;
import wrappers.LinkedInWrappers;

public class LinkedInTestCase03POM extends LinkedInWrappers{
	
	@Test(dataProvider="fetchData")
	public void TcCw01 (String userName, String passWord, String KeyWord) throws InterruptedException {
		
		new LinkedInLogin()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		//.VerifyWelcomemsg("SUBRAMANIAN MUTHURAMAN")
		.clickProfile()
		.getCurrentOrganization()
		.verifySkill(KeyWord)
		.clickAddSkill()
		.enterSkill(KeyWord)
		.clickAddButton()
		.clickSaveButton();
		
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC003";
		browserName="chrome";
		testCaseName="Login to LinkedIn";
		testDescription="Test Case 3 in LinkedIn using POM framework";
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