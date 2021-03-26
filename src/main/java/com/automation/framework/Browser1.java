package com.automation.framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.base.Base1;

public class Browser1 {

	
	
	public static Logger log = Logger.getLogger(Browser1.class);
	
	public static  void  startBrowser() {
		
		String browserName = Base1.reader.getBrowser().toLowerCase();
		log.info("Selected Browser = " + browserName);
		switch(browserName) {
		case "chrome":
//			WebDriverManager.chromedriver().version( "89.0.4389.90").setup();
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			Base1.driver= new ChromeDriver();
			log.info("Chrome Driver is opening " + Base1.driver.hashCode());
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			Base1.driver= new FirefoxDriver();
//			log.info("Firefox Driver is opening " + Base1.driver.hashCode());
//		
//		case "ie":
//			WebDriverManager.iedriver().setup();
//			Base1.driver= new InternetExplorerDriver();
//			log.info("IE Driver is opening " + Base1.driver.hashCode());
//		
//		case "edge":
//			WebDriverManager.edgedriver().setup();
//			Base1.driver= new EdgeDriver();
//			log.info("EDGE Driver is opening " + Base1.driver.hashCode());
//		
//		case "htmlUnit":
//			WebDriverManager.iedriver().setup();
//			Base1.driver= new HtmlUnitDriver();
//			log.info("HTML Driver is opening " + Base1.driver.hashCode());
//		
		}
	}
		
	 public  static void maximize(){
		    
		    Base1.driver.manage().window().maximize();
		 
	   }
			
	 
	 
	 public static byte[] takeScreenshot() {
		
		TakesScreenshot scrshot =  (TakesScreenshot) Base1.driver;
		try {
	    return scrshot.getScreenshotAs(OutputType.BYTES);
		}catch(Exception e ) {
			log.info("Exception occured while capturing  Screenshot");
		return null;	
			
		}
	 
	 }
	
	
	
	
	
	
	
	
	
}