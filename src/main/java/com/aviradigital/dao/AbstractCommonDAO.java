package com.aviradigital.dao;

import java.io.IOException;
import java.util.Properties;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractCommonDAO extends NamedParameterJdbcDaoSupport implements CommonDAO {

	@Override
	public Properties loadQueries(String fileName, Class<?> clasz,String queryName) {
		if("".equals(PropertiesManager.getInstance().getProperties().getProperty(queryName,""))) {
			try {
				PropertiesManager.getInstance().loadProperties(fileName, clasz);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return PropertiesManager.getInstance().getProperties();
	}
	
}
