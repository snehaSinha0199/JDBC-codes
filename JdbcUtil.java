package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	static {
		// Step 1:Load the Driver class.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("while loading the Driver we get " + e.getMessage());
		}
	}

	public static Connection getMySqlConnection() {
		// Step 2: Establish the connection.
		final String url = "jdbc:mysql://localhost:3306/student";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, "root", "Sneha@123");
		} catch (SQLException e) {
			System.out.println("exception occur while establishing the connection " + e.getCause());
		}
		return con;
	}

	public static void cleanUp(Statement st, Connection con) {

		// Step 7: Close all the resources.
		try {
			if (con != null)
				con.close();
			if (st != null)
				st.close();
		} catch (SQLException e) {
			System.out.println("Exception occur while closing the resources");
		}

	}

	public static void cleanUp(Statement st, Connection con, ResultSet rs) {

		// Step 7: Close all the resources.
		try {
			if (con != null)
				con.close();
			if (st != null)
				st.close();
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			System.out.println("Exception occur while closing the resources");
		}

	}
}
