package com.automation.stepdef;

import org.junit.Assert;

import com.automation.framework.Elements1;
import com.automation.pages.HeadersSection;
import com.automation.pages.SearchResultsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search1 {
	
	
	HeadersSection header_section = new HeadersSection();
	SearchResultsPage searchResultsPage =new SearchResultsPage();

@When("^I search for a product \"([^\"]*)\"$")
public void i_search_for_a_product(String product_name) {
	Elements1.TypeText(HeadersSection.search_Box, product_name);
	Elements1.click(HeadersSection.search_Box);
	
    
    
}

@Then("^I should see the product in Serch Results$")
public void i_should_see_the_product_in_Serch_Results()  {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    Assert.assertTrue(Elements1.isDisplayed(SearchResultsPage.samsung_Search_Element));
    
}

 
@Then("^No product should appear  in search results$")
public void no_product_should_appear_in_search_results()  {
    Elements1.VerifyTextEquals(SearchResultsPage.item_not_found, "There is no product that matches the search criteria.");
	
	
    
}	
	
	
	
	

}
