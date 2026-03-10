package capg.assignment.hibernate;

public class BankService {
	
	public int createAccount(int account_no, String customer_name , long mobile_number, double balance) {
		System.out.println("This is Bank Service");
		System.out.println(account_no + "  " + customer_name + "  " + mobile_number + "  " + balance);
		
		BankBean bankBean = new BankBean();
		bankBean.setAccount_no(account_no);
		bankBean.setCustomer_name(customer_name);
		bankBean.setAccount_balance(balance);
		bankBean.setMobile_number(mobile_number);
		
		BankDAO bankdao = new BankDAO();
		int k = bankdao.createAccount(bankBean);
		return k;
	}
	
	public double showAccountBalance(int account_no) {
		BankDAO bankdao = new BankDAO();
		
		double balance = bankdao.showAccountBalance(account_no);
		
		return balance;
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
