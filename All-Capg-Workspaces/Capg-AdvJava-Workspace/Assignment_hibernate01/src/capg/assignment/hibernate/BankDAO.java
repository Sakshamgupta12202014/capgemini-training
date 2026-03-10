package capg.assignment.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankDAO {
	
	public int createAccount(BankBean bankBean) {
		
		return 0;
	}
	
	public double showAccountBalance(int account_no) {
		
		return 0.0;
	}
	
	public int depositMoney(int account_no) {
		
		return 0;
	}
	
	public double withdrawMoney(int account_no) {
		
		return 0.0;
	}
	
	public int fundTransfer(BankBean b1, BankBean b2, double amount) {
		
		return 0;
	}
}
