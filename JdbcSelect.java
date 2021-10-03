package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {
public static void main(String[] args) {
	Connection con = JdbcUtil.getMySqlConnection();
	String query="select * from Batch";
	Statement st=null;
	ResultSet rs=null;
	try {
		 st = con.createStatement();
		 rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getNString(2));
		}
	} catch (SQLException e) {

	}
	finally {
		JdbcUtil.cleanUp(st,con,rs);
		
	}
}
}
