package com.socialtech.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.socialtech.Item;

public class ItemsDoa {

	public ItemsDoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	// create database parameters
	String url = "jdbc:mysql://localhost:3306/mydb";
	String user = "root";
	String password = "nkeng";
	String sql = "SELECT * FROM items";
	List items = new ArrayList<Item>();
	
	public List<Item> select() {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			st = con.prepareStatement(sql);
			rs = st.executeQuery();
			while(rs.next()) {
				Item item = new Item();
				item.setItemId(rs.getInt("item_id"));
				item.setItemName(rs.getString("item_name"));
				item.setItemPrice(rs.getDouble("item_price"));
				items.add(item);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return items;
	}
	public boolean registerItems(int itemId, String itemName, double itemPrice) {
		Connection con = null;
		PreparedStatement st = null;
		String insertQuery = "INSERT INTO items(item_id, item_name, item_price)"+ "VALUES(?,?,?)";
		boolean success = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			st = con.prepareStatement(insertQuery);
			st.setInt(1, itemId);
			st.setString(2, itemName);
			st.setDouble(3, itemPrice);
			st.execute();
			success = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}
}
