package com.aviradigital.dao;

import java.util.Properties;

public interface CommonDAO {
	
	String USER_QUERIES_FILE_NAME = "userSQL.properties";
	String CONTRACT_QUERIES_FILE_NAME = "contractSQL.properties";
	
	public Properties loadQueries(String fileName, Class<?> clasz, String queryName);

}
