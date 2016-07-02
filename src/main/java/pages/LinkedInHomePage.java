package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInHomePage extends LinkedInWrappers{


	public LinkedInHomePage(){

		if(!verifyTitle("Welcome! | LinkedIn")){

			Reporter.reportStep("This is not the Home Page", "FAIL");
		}
	}


	public LinkedInHomePage VerifyWelcomemsg (String text) {

		verifyTextByXpath("//a[@class='name']", text);

		//verifyTextByLink("SUBRAMANIAN MUTHURAMAN", "Subramanian");

		return this;

	}

	public LinkedInHomePage VerifyHomePageTitle(String text) {

		verifyTitle(text);

		return this;

	}
	
	public LinkedInJobPage clickJobs() throws InterruptedException{

		clickByXpath("(//a[@class='nav-link'])[3]");
		Thread.sleep(2000);
		return new LinkedInJobPage();

	} 

	
	public LinkedInProfilePage clickProfile() throws InterruptedException{

		clickByXpath("(//a[@class='nav-link'])[2]");

		return new LinkedInProfilePage();

	}

	public LinkedInAdvanceSearchPage clickAdvSearch() throws InterruptedException{

		clickById("advanced-search");

		return new LinkedInAdvanceSearchPage();

	}


	public LinkedInHomePage moveToLogout(String id){


		mouseOverById(id);

		return this;

	}

	public LinkedLogOut clickLogout(){

		mouseOverClickByLinkText("Sign Out");
		return new LinkedLogOut();

	}


	public LinkedInMessagePage clickOnMessageIcon() throws InterruptedException{

		clickByXpath("//div[@id='account-nav']/ul/li[1]/a");
		
		////*[@id='account-nav']/ul/li[1]/a

		return new LinkedInMessagePage();

	}





	/*public LinkedLogOut clickLogout () throws InterruptedException{

		mouseOverClickByXpath("//a[@class='account-submenu-split-link']");
		Thread.sleep(2000);

		return new LinkedLogOut()	
	}*/

}
