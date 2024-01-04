package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class demo {
	public static void main(String[] args) {
		
			String query="select ename,eid from empdb.emp where dept=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","System@12");
			java.sql.PreparedStatement pstmt= con.prepareStatement(query);
			pstmt.setString(1,"research");
			
			pstmt.setString(1,"Dev");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				String name=rs.getString("ename");
				int id=rs.getInt("eid");
				System.out.println(name+" "+id);
			}
			con.close();pstmt.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
