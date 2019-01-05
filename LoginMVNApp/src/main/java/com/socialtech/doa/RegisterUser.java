package com.socialtech.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import com.socialtech.User;

public class RegisterUser {

	public RegisterUser (){
		super();
		// TODO Auto-generated constructor stub
	}
	User u = new User();
	
	// create database parameters
	String url = "jdbc:mysql://localhost:3306/mydb";
	String user = "root";
	String password = "nkeng";
	String sql = "insert into users(user_id,first_name,second_name, user_name,email,password)"
					+ "values(?,?,?,?,?,?)";
	
	// boolean to test if registrations succeed
	public boolean isRegistered;
	public void registerUser(int id, String fname, String sname, String uname, String email, String pass) throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement st = null;
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			st = con.prepareStatement(sql);
			// set sql statement parameters 
			st.setInt(1, id);
			st.setString(2, fname);
			st.setString(3, sname);
			st.setString(4, uname);
			st.setString(5, email);
			st.setString(6, pass);
			
			// execute statement
			st.execute();
		
	}
	
}
