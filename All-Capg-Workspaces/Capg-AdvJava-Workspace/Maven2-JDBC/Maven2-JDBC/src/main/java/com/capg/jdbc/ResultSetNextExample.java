package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetNextExample {
	public static void main(String args[]) {
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; // XE --> SELECT NAME FROM v$database;
		
		String userName="scott";
		String password="tiger";
		
		try {
			Class.forName(driver);
			
			try {
				
				conn = DriverManager.getConnection(url,userName,password);
				Statement stmt = conn.createStatement();
				//int i=stmt.executeUpdate("Insert into Employeeinfo1 values(2,'Sriram',50000)");
				ResultSet rs= stmt.executeQuery("SELECT * FROM Employeeinfo1");
				
				//System.out.println("Inserted correctle: "+i);
				
				while(rs.next()) {
					System.out.println("Employee no: "+rs.getInt(1));
					System.out.println("Employee name: "+rs.getString("ename"));
					System.out.println("Employee sal: "+rs.getInt(3));

				}
				conn.close();
			}catch(SQLException e) {
				System.out.println(e);
			}
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
