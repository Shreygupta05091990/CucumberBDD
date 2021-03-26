package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base1;

public class AccountSuccessPage {
	
	
    public AccountSuccessPage() {
    	
    	PageFactory.initElements(Base1.driver, this);
    }
	
	
	@FindBy(linkText = "Success")
	public static WebElement successBreadCrumb;
	

}
