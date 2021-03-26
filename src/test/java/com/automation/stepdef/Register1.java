package com.automation.stepdef;

import java.util.Map;

import com.automation.base.Base1;
import com.automation.framework.Elements1;
import com.automation.pages.AccountSuccessPage;
import com.automation.pages.HeadersSection;
import com.automation.pages.RegisterPage1;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Register1 {

	HeadersSection headerSection = new HeadersSection();
	RegisterPage1 registerPage1 = new RegisterPage1();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();

	@Given("^I launch the application$")
	public void i_launch_the_application() {
		Base1.driver.get(Base1.reader.getUrl());

	}

	@And("^I navigate to Account registration page$")
	public void i_navigate_to_Account_registration_page() {
		Elements1.click(HeadersSection.MyAccountLink);
		Elements1.click(HeadersSection.register);

	}

	@When("^I provide all the valid  details$")
	public void i_provide_all_the_valid_details(DataTable datatable) {
		RegisterPage1.enterAllDetails(datatable,"Unique");

	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
		Elements1.click(RegisterPage1.privacyPolicy);

	}

	@And("^I click on the continue button$")
	public void i_click_on_the_continue_button() {
		Elements1.click(RegisterPage1.continue_button);

	}

	@SuppressWarnings("deprecation")
	@Then("^I should see  User account  has been successfully created$")
	public void i_should_see_User_account_has_been_successfully_created() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(Elements1.isDisplayed(AccountSuccessPage.successBreadCrumb));

	}

	@SuppressWarnings("deprecation")
	@Then("^I should see the user account is not created$")
	public void i_should_see_the_user_account_is_not_created() {
		Assert.assertTrue(Elements1.isDisplayed(RegisterPage1.registerBreadCrumb));

	}

	@SuppressWarnings("deprecation")
	@And("^I should see the erorr messages informing the  user to fill the mandatory fields$")
	public void i_should_see_the_erorr_messages_informing_the_user_to_fill_the_mandatory_fields() {

		Assert.assertTrue(Elements1.isDisplayed(RegisterPage1.first_Name_Warning));
		Assert.assertTrue(Elements1.isDisplayed(RegisterPage1.last_Name_Warning));
		Assert.assertTrue(Elements1.isDisplayed(RegisterPage1.email_Warning));
		Assert.assertTrue(Elements1.isDisplayed(RegisterPage1.telephone_Warning));
		Assert.assertTrue(Elements1.isDisplayed(RegisterPage1.password_Warning));
		Assert.assertTrue(Elements1.isDisplayed(RegisterPage1.main_Warning));

	}

	@And("^I subscribe the Newsletter$")
	public void i_subscribe_the_Newsletter() {
		Elements1.click(RegisterPage1.yes_to_Newsletter);

	}
    
	@When("^I provide the below duplicate details$")
	public void i_provide_the_below_duplicate_details(DataTable datatable) {
		RegisterPage1.enterAllDetails(datatable, "duplicate");
		
	}

	@SuppressWarnings("deprecation")
	@Then("^I should see  User is not able to create Duplicate accoun$")
	public void i_should_see_User_is_not_able_to_create_Duplicate_accoun() {

	   Assert.assertTrue(Elements1.VerifyTextEquals(RegisterPage1.main_Warning,"Warning: E-Mail Address is already registered!"));
}
}