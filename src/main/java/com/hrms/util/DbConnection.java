package com.hrms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.loading.PrivateClassLoader;

public class DbConnection {

	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Connection connection=null;
	
			Class.forName("com.mysql.cj.jdbc.Driver");  
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms","root","root");  
			 
		return connection;
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(DbConnection.getConnection());
	}
}
