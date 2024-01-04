package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","System@12");
			String query="update empdb.emp set dno=4 where ename='Shree' ";
			Statement st=con.createStatement();
			int rs=st.executeUpdate(query);
			System.out.println(rs+"no of rows updated");
			con.close();st.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
