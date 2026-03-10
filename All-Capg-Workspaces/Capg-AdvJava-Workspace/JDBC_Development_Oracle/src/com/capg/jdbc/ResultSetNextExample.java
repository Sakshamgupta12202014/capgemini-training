package com.capg.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetNextExample {
	public static void main(String []args) {
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		String username = "scott";
		String password = "tiger";
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, username, password);
			
			try {
				Statement stmt = conn.createStatement();
				
				ResultSet rs = stmt.executeQuery("Select * from EmployeeInfo1");
				
				while(rs.next()) {
					System.out.println("Employee No : " + rs.getInt(1));
					System.out.println("Employee Name : " + rs.getString("ename"));
					System.out.println("Employee sal : " + rs.getInt(3));
				}
			}catch(SQLException s) {
				System.out.println(s);
			}
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
