package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","System@12");
			String query="insert into empdb.emp value(101,'Baushra','research',1,'F')";
			Statement smt=con.createStatement();
			smt.executeUpdate(query);
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
