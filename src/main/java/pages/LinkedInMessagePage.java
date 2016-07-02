package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInMessagePage extends LinkedInWrappers {

	public LinkedInMessagePage(){

		if(!verifyTitle("Messaging | LinkedIn")){

			Reporter.reportStep("This is not the Message Page", "FAIL");
		}
	}


	public LinkedInMessagePage clickOnNewMessage(){
		clickById("compose-button");
		return this;
	}


	public LinkedInMessagePage enterContactName(String data){
		enterContactNameById("pillbox-input", data);
		return this;
	}

	public LinkedInMessagePage enterMessageContent(String data) {
		enterById("compose-message", data);
		return this;
	}

	public LinkedInMessagePage clickOnSendMessage(){
		clickByXpath("//button[@class='message-submit']");
		return this;
	}
	
	
	public LinkedInMessagePage clickOnEnterCheckBox(){
		clickByXpath("//input[@id='enter-to-send-checkbox']");
		return this;
	}
	
}
