package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectImproved {
	public static void main(String[] args) {
		String query = "select * from Batch";
		try (Connection con = ImprovedJdbcUtil.getMySqlConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);) {

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));

			}
		} catch (SQLException e) {

		}
	}
}
