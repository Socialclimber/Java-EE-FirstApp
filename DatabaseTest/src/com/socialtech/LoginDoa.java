package com.socialtech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDoa {
	static String url = "jdbc:mysql://localhost:3306/web_app_db";
	static String username = "root";
	static String password = "nkeng";
	static String sql ="select * from login where user_name=? and password=? ";
	public static void main(String[] args) {
		try {
			System.out.println("Hello World");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			String uname = "nkeng";
			String pass = "nkeng";
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			
			/*System.out.println(rs.getString("user_name"));
			System.out.println(rs.getString("password"));
			if(rs.next()){
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
				
			}*/
			while(rs.next()) {
				System.out.println(rs.getString("password"));
			}
			
		}catch(Exception e) {
			System.out.print(e.getStackTrace());
			e.printStackTrace();
		}
		
	}
}
