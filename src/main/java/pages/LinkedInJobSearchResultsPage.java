package pages;

import wrappers.LinkedInWrappers;

public class LinkedInJobSearchResultsPage extends LinkedInWrappers{

	public LinkedInJobSearchResultsPage VerifyJobdetailTitle(String text) {

		verifyTitle(text);
		return this;

	}

	public LinkedInJobSearchResultsPage getCopanyName(){

		getTextByXpath("//span[@class='company']");
		return this;

	}
	
	public LinkedInJobCompanyPage clickOnCompanyName(){
		clickByXpath("//span[@class='company']");
		return new LinkedInJobCompanyPage();
	}

}
