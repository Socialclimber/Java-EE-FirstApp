package com.socialtech.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.socialtech.User;

public class LoginDoa {
	
	// Connection paramenters
	String url= "jdbc:mysql://localhost:3306/mydb";
	String username = "root";
	String password = "nkeng";
	// Create an object of user so that we can use it to store data from the database
	 
	// create login method
		
	public User login(String uname, String pass) {
		// JDBC Statments
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		User u = new User();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			st  = con.createStatement();
			rs = st.executeQuery("SELECT * FROM users WHERE user_name='"+uname+"'");
			// if query is successful, scan through the columns
			if(rs.next()) {
				
				u.setUserId(rs.getInt("user_id"));
				u.setFirstName(rs.getString("first_name"));
				u.setSecondName(rs.getString("second_name"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				u.setUserName(rs.getString("user_name"));
			}else {
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}
}
