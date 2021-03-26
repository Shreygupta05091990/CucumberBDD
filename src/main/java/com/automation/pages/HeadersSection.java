package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base1;

public class HeadersSection {

	public HeadersSection() {
		
		PageFactory.initElements(Base1.driver, this);
		
		
	}
	
	@FindBy(xpath = "//span[text()=\"My Account\"]")
	public static WebElement MyAccountLink;  
	
	@FindBy(linkText = "Register")
	public static WebElement register;
	
	
	@FindBy(linkText = "Login")
	public static WebElement login;
	
	
	@FindBy(name = "search")
	public static WebElement search_Box;
	

	@FindBy(css = "button[class$='btn-lg']")
	public static WebElement search_button;
}
