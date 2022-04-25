package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import base.ProjectSpecificMethods;


public class CreateLead extends ProjectSpecificMethods{
	
	@Test
	public void runCreateLead() throws InterruptedException {
		
	new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmSfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.createLeadButton()
		.verifyFirstName();

	}

}
