package com.socialtech.doa;

import java.sql.Connection;
import java.sql.DriverManager;




public class RegisterDoa {
	String url = "jdbc:mysql://localhost:3306/mydb";
	String username = "root";
	String password = "nkeng";
	String sql = " insert into user(user_id, user_name, first_name, sur_name, middle_name)"+ " values (?, ?, ?, ?, ?)";
	public boolean register() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
