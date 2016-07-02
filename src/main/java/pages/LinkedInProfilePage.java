package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInProfilePage extends LinkedInWrappers{

//	public LinkedInProilePage(){
//
//		if(!verifyTitle("Edit Profile | LinkedIn")){
//
//			Reporter.reportStep("This is not the Profile Page", "FAIL");
//		}
//	}

	public LinkedInProfilePage getCurrentOrganization(){

		String OrgName = getTextByXpath("//p[@class='title field-text ']");

		Reporter.reportStep("The Current Organization name is: "+OrgName+"", "PASS");
		return this;
	}


	public LinkedInProfilePage verifySkill(String text){

		verifytextforMutlipleObject("//span[@class='endorse-item-name-text']", text);

		return this;
	}


	public LinkedInProfilePage clickAddSkill(){

		clickByXpath("(//button[@title='Add skill'])[1]");

		return this;	
	}


	public LinkedInProfilePage enterSkill(String data){

		enterById("edit-skills-add-ta", data);

		return this;
	}


	public LinkedInProfilePage clickAddButton(){

		clickById("edit-skills-add-btn");

		return this;
	}
	
	
	public LinkedInProfilePage clickSaveButton(){

		clickByXpath("//input[@class='btn-primary']");

		return this;
	}


}
