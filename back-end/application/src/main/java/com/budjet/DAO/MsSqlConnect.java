package com.budjet.DAO;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class MsSqlConnect {
	
	private static Connection connexion;
	
	private MsSqlConnect() {
		try {
			SQLServerDataSource dataSource = new SQLServerDataSource();
			dataSource.setServerName("127.0.0.1");
			dataSource.setPortNumber(1433);
			dataSource.setDatabaseName("Budjet");
			dataSource.setIntegratedSecurity(false);
			dataSource.setEncrypt(false);
			dataSource.setUser("sa");
			dataSource.setPassword("azerty@123456" );
			connexion = dataSource.getConnection();	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static synchronized Connection getConnection() {
		if(connexion == null) {
			new MsSqlConnect();
		}
		return connexion;
	}
	
	

}
