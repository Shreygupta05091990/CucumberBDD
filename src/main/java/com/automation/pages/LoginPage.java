package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base1;
import com.automation.framework.Elements1;

public class LoginPage {
	
	
	 public LoginPage() {
		PageFactory.initElements(Base1.driver, this);
	}

	@FindBy(id="input-email")
	public static WebElement email_Field;
	
	@FindBy(xpath="//input[@id='input-password']")
	public static WebElement password_Field;
	
	@FindBy(css = "input[type='submit'][value='Login']")
	public static WebElement login_button;

	
	@FindBy(css = "div[class$='alert-dismissible']")
	public static WebElement login_Warning;

	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
	public static WebElement forgotten_password;
	
	
	


   public static void doLogin(String email,  String password) {
	   Elements1.TypeText(LoginPage.email_Field,email);
	    Elements1.TypeText(LoginPage.password_Field,password);
	    Elements1.click(LoginPage.login_button);
	   
	   
   }

}
