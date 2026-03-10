package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task1 {

	static Scanner sc;
	static Connection conn;
	static String driver;
	static String url;
	static String username;
	static String password;
	
	static {
		sc = new Scanner(System.in);
		conn = null;
		driver = "oracle.jdbc.driver.OracleDriver";
		url = "jdbc:oracle:thin:@localhost:1521:XE";
		username = "scott";
		password = "tiger";
	}
	
	public static void main(String[] args) {
		// db connection
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
						
			int choice;
			do {
				System.out.println("1. Insert\n2. View all Records\n3. Delete\n4. Exit.");
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				
				switch(choice) {
					case 1 : {
						insertEmployee();
						break;
					}
					case 2 : {
						viewAllEmployees();
						break;
					}
					case 3 : {
						deleteEmployee();
						break;
					}
					case 4 : {
						System.out.println("Exiting....\nProgram terminated");
						break;
					}
					default : {
						System.out.println("Invalid Input");
					}
				}
			}while(choice != 4);
			conn.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void insertEmployee() {
		System.out.print("Enter Emp no : ");
		int empno = sc.nextInt();
		
		System.out.print("Enter Emp name : ");
		sc.nextLine();
		String empname = sc.nextLine();
		
		System.out.print("Enter Emp salary : ");
		int salary = sc.nextInt();
		
        String sqlInsert = "INSERT INTO EmployeeInfo1(empno, ename, sal) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement psInsert = conn.prepareStatement(sqlInsert);
			psInsert.setInt(1, empno);
			psInsert.setString(2, empname);
			psInsert.setInt(3, salary);
			
			int inserted = psInsert.executeUpdate();
			System.out.println("Rows Inserted : " + inserted);
			
			psInsert.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void viewAllEmployees() {
		try {
			String sqlSelect = "SELECT empno, ename, sal FROM EmployeeInfo1";
			PreparedStatement psSelect = conn.prepareStatement(sqlSelect);
			
			ResultSet rs = psSelect.executeQuery();
			
			while(rs.next()) {
				System.out.println("Employee No : " + rs.getInt(1));
				System.out.println("Employee Name : " + rs.getString("ename"));
				System.out.println("Employee salary : " + rs.getInt(3));
				System.out.println("\n-------------------------------------------------------");
			}
			
			psSelect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteEmployee() {
		try {
			System.out.print("Enter the Employee Number : ");
			int empno = sc.nextInt();
			
			String sqlDelete = "DELETE FROM EmployeeInfo1 WHERE empno = ?";
			PreparedStatement psDelete = conn.prepareStatement(sqlDelete);
			
			psDelete.setInt(1, empno);
			
			int rowsDeleted = psDelete.executeUpdate();
			System.out.println("Rows Deleted : " + rowsDeleted);
			
			psDelete.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
