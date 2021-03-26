package com.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base1;
import com.automation.framework.Elements1;

import cucumber.api.DataTable;



public class RegisterPage1 {

	
	public  RegisterPage1() {
		
		
		PageFactory.initElements(Base1.driver,this); //Asking Driver instance  to initialize webelements  with 
		 //  respective locator values for further processing
		
	}
	
	
	@FindBy(id = "input-firstname")
	public static WebElement  firstName;
	
	
	@FindBy( id = "input-lastname")
	public static WebElement lastname;
	
	@FindBy(id ="input-email")
	public static WebElement  email;
	
	@FindBy(id ="input-telephone")
	public static WebElement  telephone;
	
	
	@FindBy(id="input-password")
	public static WebElement  password;
	
	
	@FindBy(id="input-confirm")
	public  static WebElement confirmPassword;
	
	

	@FindBy(css = "input[type='submit'][value='Continue']")
	public static WebElement  continue_button;
	
	
	
	@FindBy(name = "agree")
	public static WebElement  privacyPolicy;
	
	@FindBy(linkText = "Register")
	public static WebElement  registerBreadCrumb;
	
	/************************Erorr Messages WEbelements**************************/
	
	@FindBy(css = "input[id='input-firstname']+div")
	public static WebElement  first_Name_Warning;
	
	
	@FindBy(css = "input[id='input-lastname']+div")
	public static WebElement  last_Name_Warning;
	
	@FindBy(css = "input[id='input-email']+div")
	public static WebElement  email_Warning;
	
	@FindBy(css = "input[id='input-telephone']+div")
	public static WebElement  telephone_Warning;
	
	@FindBy(css = "input[id='input-password']+div")
	public static WebElement  password_Warning;
	
	@FindBy(css = "div[class$='alert-dismissible']")
	public static WebElement  main_Warning;
	
	@FindBy(css = "#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]")
	public static WebElement  yes_to_Newsletter;
	
	
	
	
	public  static void enterAllDetails(DataTable datatable, String detailsType) {
		
		Map<String,String> map = datatable.asMap(String.class, String.class);
		Elements1.TypeText(firstName, map.get("FirstName"));
		Elements1.TypeText(RegisterPage1.lastname, map.get("LastName"));
		Elements1.TypeText(RegisterPage1.telephone, map.get("Telephone"));
		Elements1.TypeText(RegisterPage1.password, map.get("Password"));
		Elements1.TypeText(RegisterPage1.confirmPassword, map.get("Password"));
	
		if (detailsType.equalsIgnoreCase("duplicate")) {
			Elements1.TypeText(RegisterPage1.email, map.get("Email"));
		}
		else {
			Elements1.TypeText(RegisterPage1.email, System.currentTimeMillis()+map.get("Email"));
		}
		
	}

	
}
