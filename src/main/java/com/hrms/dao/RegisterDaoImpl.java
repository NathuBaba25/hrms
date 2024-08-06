package com.hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.hrms.model.RegisterModel;
import com.hrms.util.DbConnection;
public class RegisterDaoImpl implements RegisterDao {

	@Override
	public int registerUser(RegisterModel model) {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement myStmt = null;
		int row = 0;
		try {
			myConn = DbConnection.getConnection();
			myStmt = myConn.prepareStatement(
					"INSERT INTO registerUser(userName,email,address,mobileNo,topic,pmailId,registerDate) VALUES (?,?,?,?,?,?,?)");
			myStmt.setString(1, model.getUserName());
			myStmt.setString(2, model.getEmail());
			myStmt.setString(3, model.getAddress());
			myStmt.setLong(4, model.getMobileNo());
			myStmt.setString(5, "java");
			myStmt.setString(6, model.getPmailId());
			myStmt.setString(7, model.getRegisterDate());
			row = myStmt.executeUpdate();
			if (row > 0) {
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
    @Override
	public List<RegisterModel> finduser(RegisterModel model) {
		List<RegisterModel> users = new ArrayList<>();
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			myConn = DbConnection.getConnection();
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("SELECT * FROM registerUser");

			while (myRs.next()) {
				RegisterModel user1 = new RegisterModel();
				user1.setUserId(myRs.getInt("userId"));
				user1.setUserName(myRs.getString("userName"));
				user1.setEmail(myRs.getString("email"));
				user1.setAddress(myRs.getString("address"));
				user1.setMobileNo(myRs.getLong("mobileNo"));
				user1.setRegisterDate(myRs.getString("registerDate"));
				user1.setPmailId(myRs.getString("pmailId"));

				users.add(user1);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace(); 
		} finally {
			try {
				if (myRs != null)
					myRs.close();
				if (myStmt != null)
					myStmt.close();
				if (myConn != null)
					myConn.close();
			} catch (SQLException e) {
				e.printStackTrace(); // Handle the exception properly
			}
		}

		return users;
	}
}