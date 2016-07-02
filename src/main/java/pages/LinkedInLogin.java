package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInLogin extends LinkedInWrappers{
	
	public LinkedInLogin () {
		
		if(!verifyTitle("World’s Largest Professional Network | LinkedIn")){
			
			Reporter.reportStep("This is not the Login Page", "FAIL");
		}
			

	}
	
	public LinkedInLogin linkedinLogin(String browser){
		
		launchApp(browser);
		return this;		
	}
	
	public LinkedInLogin enterUserName(String data) {
	
		enterById("login-email", data);
		return this;
	
	}
	
	public LinkedInLogin enterPassword(String data) {
		
		enterById("login-password", data);
		return this;
	
	}
	
	public LinkedInHomePage clickLogin () {
		
		clickByXpath("//input[@name='submit']");
		return new LinkedInHomePage();
	
	}

}
