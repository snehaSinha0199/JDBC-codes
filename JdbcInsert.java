package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getMySqlConnection();
		String query = "Insert into fee values('sneha',1200)";
		Statement st = null;
		try {
			st = con.createStatement();
			int count = st.executeUpdate(query);
			if (count > 0)
				System.out.println("record inserted");
			else
				System.out.println("record doesnot inserted");
		} catch (SQLException e) {
			System.out.println("exception occur while processsing the query");
		} finally {
			JdbcUtil.cleanUp(st, con);
		}
	}
}
