package com.automation.base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.automation.config.ConfigurationReader1;
import com.automation.config.PropertyFileReader1;
import com.automation.framework.Browser1;
import com.automation.util.PathHelper1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Base1 {

	public static Logger log = Logger.getLogger(Base1.class);
	public static WebDriver driver;
	public static ConfigurationReader1 reader;
    
	
	/*
	 * @Before public void setup(Scenario scenario) {
	 * 
	 * log.info("Scenario started "+ scenario.getName());
	 * PropertyConfigurator.configure(PathHelper1.getResourcePath(
	 * "src/main/resources/ConfigurationFile/log4j.properties")); reader= new
	 * PropertyFileReader1(); Browser1.startBrowser(); Browser1.maximize();
	 * 
	 * 
	 * }
	 * 
	 * 
	 * @After public void tearDown(Scenario scenario) { if(scenario.isFailed()) {
	 * //get Screenshot code Here } log.info("Scenario Completed "+
	 * scenario.getName()); log.info("Scenario Status is " + scenario.getStatus());
	 * Base1.driver.quit();
	 * 
	 * }
	 */
	
	
}
