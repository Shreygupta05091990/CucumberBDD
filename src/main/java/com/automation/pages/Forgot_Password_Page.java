package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base1;
import com.gargoylesoftware.htmlunit.Page;

public class Forgot_Password_Page {

 
	public Forgot_Password_Page() {
		PageFactory.initElements(Base1.driver, this);
	}

	@FindBy(xpath = "//*[@id=\"input-email\"]")
	public static WebElement email;

	@FindBy(css = "input[type='submit'][value='Continue']")
	public static WebElement continue_button;

	@FindBy(css = "div[class$='alert-dismissible']")
	public static WebElement success_Message;

}
