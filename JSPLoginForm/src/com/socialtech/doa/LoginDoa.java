package com.socialtech.doa;

import com.socialtech.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDoa {
	// database connection parameters
	String url = "jdbc:mysql://localhost:3306/web_app_db";
	String user = "root";
	String password = "nkeng";
	// method to connect and querry information from the database
	public User getUser(String userName) throws SQLException {
		User u = new User();
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("Select * from login where user_name ='"+userName+"'");
			if(rs.next()) {
				// put all the data in the user object
				u.setPassword(rs.getString("password"));
				u.setUserName(rs.getString("user_name"));
				u.setUserId(rs.getInt("user_id"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			// it's important to close the database
			con.close();
			st.close();
			rs.close();
		}
		return u;
	}
}
