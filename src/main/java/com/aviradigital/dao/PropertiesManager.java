package com.aviradigital.dao;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

public class PropertiesManager {
	
	private volatile static PropertiesManager propertiesManager;
	private static Properties properties = new Properties() ;
	
	private PropertiesManager(){
		
	}

	public static PropertiesManager getInstance(){
	
		if(propertiesManager==null){
			synchronized(PropertiesManager.class){
				if(propertiesManager==null){
					propertiesManager = new PropertiesManager(); 
				}
			}
		}
		
		return propertiesManager;
	}
	@SuppressWarnings("rawtypes")
	public void loadProperties(String fileName ,Class claz) throws IOException {
		ClassPathResource resource = new ClassPathResource(fileName, claz);
		try {
			properties.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Properties getProperties(){
		return properties;
	}
}
