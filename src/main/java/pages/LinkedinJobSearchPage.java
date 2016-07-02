package pages;

import wrappers.LinkedInWrappers;

public class LinkedinJobSearchPage extends LinkedInWrappers{

	public LinkedinJobSearchPage VerifyJobSearchPageTitle(String text) {

		verifyTitle(text);
		return this;
	}
	
	
	public LinkedInJobSearchResultsPage clickSecondJob(){
		clickByXpath("(//a[@class='primary-action-button label'])[2]");
		return new LinkedInJobSearchResultsPage();
	}
}
