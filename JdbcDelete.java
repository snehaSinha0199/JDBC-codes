package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {
public static void main(String[] args) {
	Connection con=JdbcUtil.getMySqlConnection();
	String query="Delete  from batch where id=102";
	Statement st=null;
	ResultSet rs=null;
	try {
		st=con.createStatement();
		int count=st.executeUpdate(query);
		if(count>0) {
			System.out.println("record deleted");
		}
		else
			System.out.println("record not deleted");
	}catch(SQLException e) {
		
	}
	finally {
		JdbcUtil.cleanUp(st, con, rs);
	}
}
			
}
