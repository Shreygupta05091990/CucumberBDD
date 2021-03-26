package com.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"classpath:FeatureFiles/Search.feature"},
				 glue = {"classpath:com.automation.stepdef"},
				 tags= {"@Search","@One"},
				 plugin= {"html:target/Cucumber_html_report"}

		
		
		        )
public class Runner { 
	
	
	

}
