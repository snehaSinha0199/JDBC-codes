package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreate {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getMySqlConnection();
		String query = "Create table fee1(name varchar(50),amount int)";
		Statement st = null;
		try {
			st = con.createStatement();
			boolean flag = st.execute(query);
			if (!flag)
				System.out.println("table created");
			else
				System.out.println("table not created");
		} catch (SQLException e) {

		} finally {
		}
		JdbcUtil.cleanUp(st, con);
	}
}
