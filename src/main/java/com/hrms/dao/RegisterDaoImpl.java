package com.hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hrms.model.RegisterModel;
import com.hrms.util.DbConnection;

public class RegisterDaoImpl implements RegisterDao {

	@Override
	public int registerUser(RegisterModel model) {
		// TODO Auto-generated method stub
		Connection myConn = null;
        PreparedStatement myStmt = null;
        int row=0;
		try {
			myConn=DbConnection.getConnection();
			myStmt = myConn.prepareStatement("INSERT INTO registerUser(userName,email,address,mobileNo,topic,pmailId) VALUES (?,?,?,?,?,?)");
			myStmt.setString(1, model.getUserName());
			myStmt.setString(2, model.getEmail());
			myStmt.setString(3, model.getAddress());
			myStmt.setLong(4, model.getMobileNo());
			myStmt.setString(5, "java");
			myStmt.setString(6, model.getPmailId());
			row=myStmt.executeUpdate();
			if(row>0) {
				System.out.println("insert records");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

}
