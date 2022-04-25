package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

import Pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods{
	
	@Test
	public void runLogin() throws InterruptedException {
		System.out.println(driver);
		//first method / action is available in the LoginPage
	//	LoginPage lp = new LoginPage(driver);
		LoginPage lp= new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage();

	}

}
