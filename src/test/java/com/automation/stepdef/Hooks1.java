package com.automation.stepdef;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.automation.base.Base1;
import com.automation.config.PropertyFileReader1;
import com.automation.framework.Browser1;
import com.automation.util.PathHelper1;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks1 {

	
	Logger log = Logger.getLogger(Hooks1.class);
	
	@Before
	public void setup(Scenario scenario) {
		
		log.info("Scenario started "+ scenario.getName());
		PropertyConfigurator.configure(PathHelper1.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
		Base1.reader= new PropertyFileReader1();
		Browser1.startBrowser();
		Browser1.maximize();
		
		
	}
	
	
	@After
	public  void  tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			scenario.embed(Browser1.takeScreenshot(), "image/png");
		}
		log.info("Scenario Completed "+ scenario.getName());
		log.info("Scenario Status is " +  scenario.getStatus());
		Base1.driver.quit();
		
	}
	
	
	
}
