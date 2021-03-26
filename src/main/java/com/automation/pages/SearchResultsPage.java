package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base1;

public class SearchResultsPage {

	
	
	public SearchResultsPage() {
	    PageFactory.initElements(Base1.driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")
	public static WebElement samsung_Search_Element;
	
	@FindBy(css = "input[id='button-search']+h2+p")
	public static WebElement item_not_found;
	
	
	




	


}
