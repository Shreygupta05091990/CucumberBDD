package com.automation.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PathHelper1 {

	public  static  String getBasePath() {
		return System.getProperty("user.dir");
		
	}
	
	 public static String  getResourcePath(String   path ) {
		
		return getBasePath()+path;
		
	}
	
	 public static  FileInputStream getInputStreamResource(String path) throws FileNotFoundException{
		 
		return new FileInputStream(getResourcePath(path)); 
		 
		 
		 
	 }
	 
	
	
	
}
