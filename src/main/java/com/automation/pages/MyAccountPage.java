package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base1;

public class MyAccountPage {
	
	
	public MyAccountPage() {
	
		PageFactory.initElements(Base1.driver, this);
	}
	
	
	
	@FindBy(linkText = "Register for an affiliate account")
	public static WebElement affiliate_Account;

	
	
	
	
}
