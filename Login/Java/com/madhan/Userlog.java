package com.madhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Userlog {
	 String driver="com.mysql.jdbc.Driver";
	 String url="jdbc:mysql://localhost:3306/user";
	 String sql="select * from user.register where name=? and password=?";
	  public boolean check(String n,String p) {		
		  try {
			  Connection con=null;
			  PreparedStatement pst2;
		      try {
					Class.forName(driver);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				   con=DriverManager.getConnection(url,"root","password");
				   pst2=con.prepareStatement(sql);
				   pst2.setString(1,n);
				   pst2.setString(2,p);
				   ResultSet rs=pst2.executeQuery();
				   if(rs.next())
				   {
					   return true;
				   }
				   con.close();
		  }
		  catch(SQLException e)
		  {
			  return false;
		  }
					   
					   				   
		return false;
			
		 
		}
}
	  
	
