package com.automation.stepdef;

import com.automation.framework.Elements1;
import com.automation.pages.Forgot_Password_Page;
import com.automation.pages.HeadersSection;
import com.automation.pages.LoginPage;
import com.automation.pages.MyAccountPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login1 {

	HeadersSection headerSection = new HeadersSection();
	LoginPage loginpage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	Forgot_Password_Page forgot_Password_Page = new Forgot_Password_Page();
	

	@Given("^I navigate to Account  Login Page$")
	public void i_navigate_to_Account_Login_Page() {
		Elements1.click(HeadersSection.MyAccountLink);
		Elements1.click(HeadersSection.login);

	}

	@When("^I login to the application using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_login_to_the_application_using_Username_as_and_Password_as(String email, String password) {
		LoginPage.doLogin(email, password);

	}

	
	
	@SuppressWarnings("deprecation")
	@Then("^I should see that the user is able to Login successfully$")
	public void i_should_see_that_the_user_is_able_to_Login_successfully() {
		Assert.assertTrue(Elements1.isDisplayed(MyAccountPage.affiliate_Account));

	}

@SuppressWarnings("deprecation")
@Then("^I should see that Credentials are invalid$")
public void i_should_see_that_Credentials_are_invalid() {
	Assert.assertTrue(Elements1.VerifyTextEquals(LoginPage.login_Warning, "Warning: No match for E-Mail Address and/or Password."));	
	}


@SuppressWarnings("deprecation")
@Then("^I see the Email has been sent to users email to reset password$")
public void i_see_the_Email_has_been_sent_to_users_email_to_reset_password() {
    Elements1.TypeText(Forgot_Password_Page.email,"shreygupta33@gmail.com");
    Elements1.click(Forgot_Password_Page.continue_button);
    Assert.assertTrue(Elements1.VerifyTextEquals(LoginPage.login_Warning, "An email with a confirmation link has been sent your email address."));
    
	
	
}
@When("^I reset the  forgotten password$")
public void i_reset_the_forgotten_password() {
    
   Elements1.click(LoginPage.forgotten_password);	
	
}
}