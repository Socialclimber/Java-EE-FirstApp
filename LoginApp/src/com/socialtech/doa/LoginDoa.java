package com.socialtech.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDoa {
	String url = "jdbc:mysql://localhost:3306/web_app_db";
	String username = "root";
	String password = "nkeng";
	String sql ="select * from login where user_name=? and password=?";
	public boolean check(String uname, String pass) {
		boolean test = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()){
				test = true;
			}
			
		}catch(Exception e) {
			
			e.getMessage();
		}
		return test;
	}
}
