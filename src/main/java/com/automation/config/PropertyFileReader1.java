package com.automation.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.automation.util.PathHelper1;

public class PropertyFileReader1 implements ConfigurationReader1 {

	Properties properties = null;

	public String getUrl() {
		return properties.getProperty("url");

	}

	public PropertyFileReader1() {

		properties = new Properties();
		try {
			properties
					.load(PathHelper1.getInputStreamResource("/src/main/resources/ConfigurationFile/config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getBrowser() {

		return properties.getProperty("browser");

	}

	public int getPageLoadTimeOut() {

		return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
	}

}
