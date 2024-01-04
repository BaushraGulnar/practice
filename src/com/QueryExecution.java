package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class QueryExecution {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","System@12");
			String query="select * from empdb.emp where dno=1";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
				int id=rs.getInt("eid");
				String name=rs.getString("ename");
				String dname=rs.getString("dept");
				int dno=rs.getInt("dno");
				String gender=rs.getString("gender");
				System.out.println(id+" "+name+" "+dname+" "+dno+" "+gender);
			}
			con.close();st.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
