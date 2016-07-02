package pages;

import wrappers.LinkedInWrappers;

public class LinkedInJobPage extends LinkedInWrappers{

	public LinkedInJobPage VerifyJobPageTitle(String text) {

		verifyTitle(text);
		
		return this;
	}

	public LinkedInJobPage enterJobName (String data){
		enterById("keyword-search-box", data);
		return this;
	}


	public LinkedinJobSearchPage clickOnFindJobs(){
		clickByXpath("//button[@data-control='2boxsearch']");
		return new LinkedinJobSearchPage();

	}
}
