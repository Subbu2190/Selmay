package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.server.handler.SendKeys;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInAdvanceSearchPage extends  LinkedInWrappers {

	String firstCount;
	String ResultCount;

//	public LinkedInAdvanceSearchPage(){
//
//		if(!verifyTitle("Search | LinkedIn")){
//
//			Reporter.reportStep("This is not the Advance Search Page", "FAIL");
//		}
//	}

	public LinkedInAdvanceSearchPage verifyAdvancedSearchPage (String text){
		verifyTextByXpath("//div[@id='advs']/h3", text);
		return this;
	}

	public LinkedInAdvanceSearchPage enterSearchKeyWord (String data) {
		enterById("advs-keywords", data);

		return this;
	}

	public LinkedInAdvanceSearchPage clickOnSearchButton() throws InterruptedException {
		clickByName("submit");
		Thread.sleep(2000);
		return this;
	}

	public LinkedInAdvanceSearchPage clickOnClose(){
		clickByXpath("//button[@class='text-button close-advs']");
		return this;
	}

	public LinkedInAdvanceSearchPage closeGroupmembers() throws InterruptedException{
		clickByXpath("(//button[@class='remove-pivot'])[2]");
		Thread.sleep(2000);
		return this;
	}

	public LinkedInAdvanceSearchPage closeSecondConnections() throws InterruptedException{
		clickByXpath("(//button[@class='remove-pivot'])[2]");
		Thread.sleep(2000);
		return this;
	}

	public LinkedInAdvanceSearchPage getFirstConnectionsTotalCount() {
		firstCount = getTextByXpath("(//div[@class='label-container']/span)[1]");

		Reporter.reportStep("The First Connections Count is: "+firstCount+"", "PASS");

		return this;

	}

	public LinkedInAdvanceSearchPage getSearchResults () throws InterruptedException {

		ResultCount = getTextByXpath("//div[@class='search-info']/p/strong");

		Reporter.reportStep("The Search Results Count is: "+ResultCount+"", "PASS");

		Thread.sleep(2000);

		return this;
	}

	public LinkedInAdvanceSearchPage getFirstConnectionName () {

		String Resultname = getTextByXpath("(//a[@class='title main-headline'])[1]");

		Reporter.reportStep("The First Connection Name is: "+Resultname+"", "PASS");

		return this;

	}

	public LinkedInAdvanceSearchPage getConnectionType () {

		String connectionType = getTextByXpath("(//abbr[@class='degree-icon '])[1]");

		Reporter.reportStep("The Connection Type is: "+connectionType+"", "PASS");

		return this;

	}

	public LinkedInAdvanceSearchPage compareSearchResults(){

		try {
			if(firstCount.equals(ResultCount))

				Reporter.reportStep("The Search results Count and First Connect count matches ", "PASS");

			//return this;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}


	public LinkedInHomePage moveToLogout(){


		mouseOverByXpath("//a[@class='account-toggle nav-link']");

		return new LinkedInHomePage();

	}


	public LinkedInAdvanceSearchPage enterCompanyName(String data){
		enterById("advs-company", data);
		return this;

	}



	public LinkedInAdvanceSearchPage selectLocation(String value) throws InterruptedException{
		selectById("advs-locationType", value);
		Thread.sleep(2000);
		return this;
	}

	public LinkedInAdvanceSearchPage selectCountry(String value) throws InterruptedException{
		selectById("advs-countryCode", value);
		Thread.sleep(2000);
		return this;
	}

	public LinkedInAdvanceSearchPage clickReset() throws InterruptedException{
		clickByXpath("//input[@class='reset-advs text-button']");
		driver.findElementByXPath("//input[@class='reset-advs text-button']").sendKeys(Keys.HOME);
		Thread.sleep(2000);
		return this;

	}
	
	
	public LinkedInAdvanceSearchPage clickFirstConections() throws InterruptedException {
		clickById("adv-F-N-ffs");
		//mouseOverById("adv-F-N-ffs");
		//mouseOverClickByXpath("//input[@id='adv-F-N-ffs']");
		Thread.sleep(2000);
		return this;

	}

}
