package com.niit.shoppingcart;

import java.sql.SQLException;

import com.niit.shoppingcart.config.ApplicationContextConfig;

public class TestConfig {
	static ApplicationContextConfig c = new ApplicationContextConfig();

	public static void main(String args[]) throws SQLException
	{
		System.out.println("testing"+c.getH2DataSource().getConnection().toString());
		System.out.println("testing"+c.getSessionFactory(c.getH2DataSource()).toString());
		System.out.println("testing"+c.getTransactionManager(c.getSessionFactory(c.getH2DataSource())).toString());
	}
	

}
