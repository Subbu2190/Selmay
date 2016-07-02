package pages;
import utils.Reporter;
import wrappers.LinkedInWrappers;

public class Company extends LinkedInWrappers{

	public Company(){

		if(!verifyTitle("IBM: Careers & Employment | LinkedIn"))
			Reporter.reportStep("This is not Login Page", "FAIL");
	}

	public Company verifyEmployeeCount(String text) {
		verifyTextByClassName(prop.getProperty("Job.JobSearch.Name"), text);

		//verifyTextByClassName("company-size", text);

		//verifyTextByClassName(Cname, text);

		return new Company();
	}
}