package com.madhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Userdb{
	public String insert(User s) {
		 String driver1="com.mysql.jdbc.Driver";
		 String url="jdbc:mysql://localhost:3306/user";
		 String sql1="insert into user.register values(?,?,?)";
		try
		{
			Connection con1=null;
			PreparedStatement pst1=null;
		   String to="Registration Done";
		   try {
			Class.forName(driver1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		   con1=DriverManager.getConnection(url,"root","password");
		   pst1=con1.prepareStatement(sql1);
		   pst1.setString(1,s.getName());
		   pst1.setString(2,s.getPwd());
		   pst1.setString(3,s.getMail());
		   pst1.executeUpdate();
		   return to;
		}
		catch(SQLException e) {
			return "Invalid Input";
		}
	}
}