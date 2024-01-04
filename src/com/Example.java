package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Example {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","System@12");
			System.out.println("connection success !");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("create table empdb.employee(eno int,ename varchar(10),esal decimal(8,2),eadd varchar(10))");
			System.out.println("table successfully created");
			con.close();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
