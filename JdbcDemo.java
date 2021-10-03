package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	/**
	 * 	Steps to Write JDBC Program
	Step 1: Load the Driver class.
	Step 2: Establish the Connection between the JDBC program and Database.
	Step 3: Prepare the SQL statement.
	Step 4: Create the JDBC statement.
	Step 5: Submit the SQL statement to Database using JDBC statement.
	Step 6: Process the result.
	Step 7: Close all the resources.
	 * 
	 */
	
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			//Step 1:Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2:Establish the Connection
			final String url="jdbc:mysql://localhost:3306/student";//student is database name
			con=DriverManager.getConnection(url, "root", "Sneha@123");
			//step 3:Prepare the sql statement
			String sql="insert into batch values(102,'batch12')";//batch is a table name
			//step 4:Create JDBC statement
			st=con.createStatement();
			 // Step 5: Submit the SQL statement to Database using JDBC statement.
			 int x = st.executeUpdate(sql);
			   // Step 6: Process the result.
			   if (x == 1) {
			    System.out.println("Record Inserted");
			   } else {
			    System.out.println("Record Not Inserted");
			   }
			  } catch (ClassNotFoundException | SQLException e) {
			   e.printStackTrace();
			  } finally {
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
			 }
}
