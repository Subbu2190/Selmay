package pages;

import wrappers.LinkedInWrappers;

public class LinkedInJobCompanyPage extends LinkedInWrappers {


	public LinkedInJobCompanyPage VerifyCompanyPageTitle(String text) {

		verifyTitle(text);
		return this;

	}


	public LinkedInJobCompanyPage getComanyEmployeeCount(){
		getTextByXpath("//p[@class='company-size']");
		return this;

	}
	
	
		public LinkedInHomePage moveToLogout(){


		mouseOverByXpath("//a[@class='account-toggle nav-link']");

		return new LinkedInHomePage();

	}

}
