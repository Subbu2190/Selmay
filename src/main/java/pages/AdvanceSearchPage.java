package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class AdvanceSearchPage extends LinkedInWrappers{


	public AdvanceSearchPage verifySearchPage (String text) {

		verifyTextByXpath("//div[@id='advs']/h3", text);

		return this;
	}

	public AdvanceSearchPage enterKeyWord(String data) throws InterruptedException{

		enterById("advs-keywords", data);
		Thread.sleep(2000);
		return this;

	}

	public AdvanceSearchPage clickSubmit () throws InterruptedException {

		clickByXpath("//input[@name='submit']");
		Thread.sleep(2000);
		return this;
	}

	private String getSearchResultCount (){
		return getTextByXpath("//div[@id='results_count']/div/p/strong[1]");
	}

	public AdvanceSearchPage verifySearchResultCount (String count) throws InterruptedException{
		
		String getCount = getSearchResultCount();
		if(getCount.equals(count))
			Reporter.reportStep("The search count :"+count +" matched with the expected count", "PASS");
		else
			Reporter.reportStep("The search count :"+count +" did not match with the expected count"+getCount, "WARN");

		return this;
	}

	public AdvanceSearchPage firstConName () throws InterruptedException{

		getTextByXpath("(//a[@class='title main-headline'])[1]");
		Thread.sleep(2000);
		return this;
	}

	public AdvanceSearchPage connectiontype () throws InterruptedException{

		getTextByXpath("(//abbr[@class='degree-icon '])[1]");
		Thread.sleep(2000);
		return this;
	}	

	public LinkedLogOut clickLogout () throws InterruptedException{

		mouseOverClickByXpath("//a[@class='account-submenu-split-link']");
		Thread.sleep(2000);

		return new LinkedLogOut();	
	}

}
