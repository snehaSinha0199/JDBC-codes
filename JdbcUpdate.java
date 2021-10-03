package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
public static void main(String[] args) {
	Connection con = JdbcUtil.getMySqlConnection();
	String query="Update Batch Set name='Spring' where id=1";
	Statement st=null;
	try {
		 st = con.createStatement();
		 int count = st.executeUpdate(query);
		 if(count>0)
			 System.out.println("record updated");
		 else
			 System.out.println("record not updated");
			 
	} catch (SQLException e) {

	}
	finally {
		JdbcUtil.cleanUp(st,con);
		
	}
}
}
