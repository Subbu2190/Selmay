package pages;

import wrappers.LinkedInWrappers;

public class LinkedLogOut extends LinkedInWrappers {
	
	public LinkedLogOut verifyLogout(String Text) {
		
		verifyTextByXpath("//div[@id='page-title']", Text);
		return this;
	}

}
